// S1APLayer.cpp: implementation of the CS1APLayer class.
//
//////////////////////////////////////////////////////////////////////

#include "stdafx.h"
#include "PacketSender.h"
#include "S1APLayer.h"

#ifdef _DEBUG
#undef THIS_FILE
static char THIS_FILE[]=__FILE__;
#define new DEBUG_NEW
#endif

//////////////////////////////////////////////////////////////////////
// Construction/Destruction
//////////////////////////////////////////////////////////////////////

CS1APLayer::CS1APLayer( char* pName )
	: CBaseLayer( pName )
{
	ResetHeader( );
}

CS1APLayer::~CS1APLayer()
{
}

void CS1APLayer::ResetHeader()
{
	m_sHeader.s1ap_pdu = 0x00;
	m_sHeader.s1ap_proc_code = 0x00;
	m_sHeader.s1ap_crit = 0x00;
	m_sHeader.s1ap_length = 0x00;
	m_sHeader.s1ap_padding = 0x0000;
	m_sHeader.s1ap_nitem = 0x00; // the number of items
	memset(m_sHeader.s1ap_data,'\0',S1AP_DATA_SIZE);

	m_sHeader2.s1ap_pdu = 0x00;
	m_sHeader2.s1ap_proc_code = 0x00;
	m_sHeader2.s1ap_crit = 0x0000;
	m_sHeader2.s1ap_length = 0x00;
	memset(m_sHeader2.s1ap_padding,0x00,2);
	m_sHeader2.s1ap_nitem = 0x00; // the number of items
	memset(m_sHeader2.s1ap_data,'\0',S1AP_DATA_SIZE+1);
}

BOOL CS1APLayer::Send(u_char* ppayload, int nlength)
{
	SelectMessage(nlength);

	BOOL bSuccess = FALSE ;

	memset(m_sHeader.s1ap_data,'\0',S1AP_DATA_SIZE);
	memset(m_sHeader2.s1ap_data,'\0',S1AP_DATA_SIZE+1);

	if(MESSAGE_TYPE == S1AP_MSG_TYPE_ATTACH_ACCEPT){
		memcpy(m_sHeader2.s1ap_data, ppayload, nlength) ;
		bSuccess = mp_UnderLayer->Send((u_char*)&m_sHeader2, S1AP_HEADER_SIZE + nlength + 1);
	}
	else{
		memcpy(m_sHeader.s1ap_data, ppayload, nlength) ;
		bSuccess = mp_UnderLayer->Send((u_char*)&m_sHeader, S1AP_HEADER_SIZE + nlength );
	}

	return bSuccess;
}

BOOL CS1APLayer::Receive(u_char* ppayload, int len)
{
	u_char result[1];
	if(len == 4)
	{
		PS1APLayer_HEADER2 pFrame = (PS1APLayer_HEADER2) ppayload ;
		result[0] = SearchItems(pFrame->s1ap_proc_code, pFrame->s1ap_data);
	}
	else
	{
		PS1APLayer_HEADER pFrame = (PS1APLayer_HEADER) ppayload ;
		result[0] = SearchItems(pFrame->s1ap_proc_code, pFrame->s1ap_data);
	}

	BOOL bSuccess = FALSE ;
	bSuccess = mp_aUpperLayer[0]->Receive((u_char*)result);
	
	return bSuccess ;
}

void CS1APLayer::SetMessageType(int msg_type)
{
	MESSAGE_TYPE = msg_type;
}

void CS1APLayer::SetTheNumberOfItems(char num)
{
	m_sHeader.s1ap_nitem = num;
}

void CS1APLayer::SetTheNumberOfItems2(char num)
{
	m_sHeader2.s1ap_nitem = num;
}

u_char CS1APLayer::SearchItems(u_char proc, u_char* ppayload)
{
	u_char ch;
	short id;
	ITEM_HEADER header;
	int i=0;

	while(1)
	{
		memcpy((u_char*)&header,&ppayload[i],ITEM_HEADER_SIZE);

		id = ntohs(header.id);
		if( id == S1AP_ID_NAS_PDU)
		{
			// length (1)
			// + security header type & proto discriminator (1)
			// + msg auth code (4)
			// + sequence number (1)
			// + security header type & proto discriminator (1)
			if(proc == S1AP_PROC_CODE_DOWNLINK_NAS_TRANS)
				i += 6;
			else
				i += 12;

			ch = ppayload[i]; // NAS EPS MME type
			return ch;
		}
		else if( id == S1AP_ID_E_RAB_TOBE_SETUP_LIST_CTXT_SUREQ)
		{
			ch = ppayload[i+33]; // NAS EPS MME type
			return ch;
		}
		else
		{
/////////////////////////////////////////////////////  문제 ////////////////////////////////////////////////////
			// 길이 계산
			i +=  ITEM_HEADER_SIZE + header.length; ; // 패킷 탐색을 위한 적절한 길이를 작성하시오. (hint: S1AP의 ITEM 포맷을 참고하시오.)
		}
		if(i>= m_sHeader.s1ap_length)
			return 0;
	}
	return 0;
}

// 어떤 메시지를 보낼 것인지 지정
void CS1APLayer::SelectMessage(int nlength)
{
	switch(MESSAGE_TYPE)
	{
	case S1AP_MSG_TYPE_ATTACH_REQUEST:
		AttachReqMsg(nlength);
		break;
	case S1AP_MSG_TYPE_AUTHEN_REQUEST:
		AuthenticationReqMsg(nlength);
		break;
	case S1AP_MSG_TYPE_AUTHEN_RESPONSE:
		AuthenticationRepMsg(nlength);
		break;
	case S1AP_MSG_TYPE_ATTACH_ACCEPT:
		initialContextSetupRequestAttachAcceptItems(nlength);
		break;
	case S1AP_MSG_TYPE_ATTACH_COMPLETE1:
		initialContextSetupResponseItems(nlength);
		break;
	case S1AP_MSG_TYPE_ATTACH_COMPLETE2:
		attachCompleteItems(nlength);
		break;
	default:
		break;
	}
}

void CS1APLayer::AttachReqMsg(int nlength)
{
/////////////////////////////////////////////////////  문제 ////////////////////////////////////////////////////
	m_sHeader.s1ap_pdu = S1AP_PDU_INITIAL_MESSAGE; // a type of PDU
	m_sHeader.s1ap_proc_code = S1AP_PROC_CODE_INITIAL_UE_MSG; // procedure code
	((CSCTPLayer*)GetUnderLayer())->SetSSN(0); // Stream Sequence Number of UnderLayer

	m_sHeader.s1ap_crit = 0x40;
	m_sHeader.s1ap_length = nlength+3;

	((CSCTPLayer*)GetUnderLayer())->SetFlags(SCTP_FLAGS_B | SCTP_FLAGS_E);
}

void CS1APLayer::AuthenticationReqMsg(int nlength)
{
/////////////////////////////////////////////////////  문제 ////////////////////////////////////////////////////
// 	AttachReqMsg 함수를 참고하여 작성하시오.
	m_sHeader.s1ap_pdu = S1AP_PDU_INITIAL_MESSAGE; // 수정하시오.
	m_sHeader.s1ap_proc_code = S1AP_PROC_CODE_INITIAL_UE_MSG; // 수정하시오.
	((CSCTPLayer*)GetUnderLayer())->SetSSN(0); // 수정하시오.

	m_sHeader.s1ap_crit = 0x40;
	m_sHeader.s1ap_length = nlength+3;

	((CSCTPLayer*)GetUnderLayer())->SetFlags(SCTP_FLAGS_B | SCTP_FLAGS_E);
}

void CS1APLayer::AuthenticationRepMsg(int nlength)
{
/////////////////////////////////////////////////////  문제 ////////////////////////////////////////////////////
// 	AttachReqMsg 함수를 참고하여 작성하시오.
	m_sHeader.s1ap_pdu = S1AP_PDU_INITIAL_MESSAGE; // 수정하시오.
	m_sHeader.s1ap_proc_code = S1AP_PROC_CODE_INITIAL_UE_MSG; // 수정하시오.
	((CSCTPLayer*)GetUnderLayer())->SetSSN(0); // 수정하시오.

	m_sHeader.s1ap_crit = 0x40;
	m_sHeader.s1ap_length = nlength+3;

	((CSCTPLayer*)GetUnderLayer())->SetFlags(SCTP_FLAGS_B | SCTP_FLAGS_E);
}

void CS1APLayer::initialContextSetupRequestAttachAcceptItems(int nlength)
{
/////////////////////////////////////////////////////  문제 ////////////////////////////////////////////////////
// 	AttachReqMsg 함수를 참고하여 작성하시오.
	m_sHeader.s1ap_pdu = S1AP_PDU_INITIAL_MESSAGE; // 수정하시오.
	m_sHeader.s1ap_proc_code = S1AP_PROC_CODE_INITIAL_UE_MSG; // 수정하시오.
	((CSCTPLayer*)GetUnderLayer())->SetSSN(0); // 수정하시오.

	m_sHeader.s1ap_crit = htons(0x0080);
	m_sHeader.s1ap_length = nlength+3;

	((CSCTPLayer*)GetUnderLayer())->SetFlags(SCTP_FLAGS_B | SCTP_FLAGS_E);
}

void CS1APLayer::initialContextSetupResponseItems(int nlength)
{
/////////////////////////////////////////////////////  문제 ////////////////////////////////////////////////////
// 	AttachReqMsg 함수를 참고하여 작성하시오.
	m_sHeader.s1ap_pdu = S1AP_PDU_INITIAL_MESSAGE; // 수정하시오.
	m_sHeader.s1ap_proc_code = S1AP_PROC_CODE_INITIAL_UE_MSG; // 수정하시오.
	((CSCTPLayer*)GetUnderLayer())->SetSSN(0); // 수정하시오.

	m_sHeader.s1ap_crit = 0x00;
	m_sHeader.s1ap_length = nlength+3;

	((CSCTPLayer*)GetUnderLayer())->SetFlags(SCTP_FLAGS_B | SCTP_FLAGS_E);
}

void CS1APLayer::attachCompleteItems(int nlength)
{
/////////////////////////////////////////////////////  문제 ////////////////////////////////////////////////////
// 	AttachReqMsg 함수를 참고하여 작성하시오.
	m_sHeader.s1ap_pdu = S1AP_PDU_INITIAL_MESSAGE; // 수정하시오.
	m_sHeader.s1ap_proc_code = S1AP_PROC_CODE_INITIAL_UE_MSG; // 수정하시오.
	((CSCTPLayer*)GetUnderLayer())->SetSSN(0); // 수정하시오.

	m_sHeader.s1ap_crit = 0x40;
	m_sHeader.s1ap_length = nlength+3;

	((CSCTPLayer*)GetUnderLayer())->SetFlags(SCTP_FLAGS_B | SCTP_FLAGS_E);
}