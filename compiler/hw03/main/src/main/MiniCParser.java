package main;
// Generated from MiniC.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, VOID=18, INT=19, WHILE=20, IF=21, ELSE=22, RETURN=23, OR=24, 
		AND=25, LE=26, GE=27, EQ=28, NE=29, IDENT=30, LITERAL=31, DecimalConstant=32, 
		OctalConstant=33, HexadecimalConstant=34, WS=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'{'", "'['", "';'", "'<'", "'='", "'}'", "']'", "'>'", 
		"'!'", "'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'void'", "'int'", 
		"'while'", "'if'", "'else'", "'return'", "'or'", "'and'", "'<='", "'>='", 
		"'=='", "'!='", "IDENT", "LITERAL", "DecimalConstant", "OctalConstant", 
		"HexadecimalConstant", "WS"
	};
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_var_decl = 2, RULE_type_spec = 3, 
		RULE_fun_decl = 4, RULE_params = 5, RULE_param = 6, RULE_stmt = 7, RULE_expr_stmt = 8, 
		RULE_while_stmt = 9, RULE_compound_stmt = 10, RULE_local_decl = 11, RULE_if_stmt = 12, 
		RULE_return_stmt = 13, RULE_expr = 14, RULE_args = 15;
	public static final String[] ruleNames = {
		"program", "decl", "var_decl", "type_spec", "fun_decl", "params", "param", 
		"stmt", "expr_stmt", "while_stmt", "compound_stmt", "local_decl", "if_stmt", 
		"return_stmt", "expr", "args"
	};

	@Override
	public String getGrammarFileName() { return "MiniC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32); decl();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VOID || _la==INT );
			System.out.println("Rule 0");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Fun_declContext fun_decl() {
			return getRuleContext(Fun_declContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(45);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39); var_decl();
				System.out.println("Rule 1-1");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); fun_decl();
				System.out.println("Rule 1-2");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); type_spec();
				setState(48); match(IDENT);
				setState(49); match(T__13);
				System.out.println("Rule 2-1");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); type_spec();
				setState(53); match(IDENT);
				setState(54); match(T__14);
				setState(55); match(T__9);
				setState(56); match(T__13);
				System.out.println("Rule 2-2");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(MiniCParser.VOID, 0); }
		public TerminalNode INT() { return getToken(MiniCParser.INT, 0); }
		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterType_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitType_spec(this);
		}
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_spec);
		try {
			setState(65);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); match(VOID);
				System.out.println("Rule 3-1");
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(63); match(INT);
				System.out.println("Rule 3-2");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_declContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Fun_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterFun_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitFun_decl(this);
		}
	}

	public final Fun_declContext fun_decl() throws RecognitionException {
		Fun_declContext _localctx = new Fun_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fun_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); type_spec();
			setState(68); match(IDENT);
			setState(69); match(T__5);
			setState(70); params();
			setState(71); match(T__4);
			setState(72); compound_stmt();
			System.out.println("Rule 4-1");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public TerminalNode VOID() { return getToken(MiniCParser.VOID, 0); }
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); param();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(76); match(T__2);
					setState(77); param();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				System.out.println("Rule 5-1");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); match(VOID);
				System.out.println("Rule 5-2");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89); type_spec();
				setState(90); match(IDENT);
				System.out.println("Rule 6-1");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); type_spec();
				setState(94); match(IDENT);
				setState(95); match(T__14);
				setState(96); match(T__9);
				System.out.println("Rule 6-2");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(116);
			switch (_input.LA(1)) {
			case T__7:
			case T__5:
			case T__2:
			case T__0:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); expr_stmt();
				System.out.println("Rule 7-1");
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); compound_stmt();
				System.out.println("Rule 7-2");
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); if_stmt();
				System.out.println("Rule 7-3");
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(110); while_stmt();
				System.out.println("Rule 7-4");
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(113); return_stmt();
				System.out.println("Rule 7-5");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitExpr_stmt(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); expr(0);
			setState(119); match(T__13);
			System.out.println("Rule 8-1");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(MiniCParser.WHILE, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(WHILE);
			setState(123); match(T__5);
			setState(124); expr(0);
			setState(125); match(T__4);
			setState(126); stmt();
			System.out.println("Rule 9-1");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_stmtContext extends ParserRuleContext {
		public List<Local_declContext> local_decl() {
			return getRuleContexts(Local_declContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Local_declContext local_decl(int i) {
			return getRuleContext(Local_declContext.class,i);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCompound_stmt(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compound_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(T__15);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==INT) {
				{
				{
				setState(130); local_decl();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__7) | (1L << T__5) | (1L << T__2) | (1L << T__0) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << IDENT) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(136); stmt();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142); match(T__10);
			System.out.println("Rule 10-1");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_declContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public Local_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterLocal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitLocal_decl(this);
		}
	}

	public final Local_declContext local_decl() throws RecognitionException {
		Local_declContext _localctx = new Local_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_local_decl);
		try {
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); type_spec();
				setState(146); match(IDENT);
				setState(147); match(T__13);
				System.out.println("Rule 11-1");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150); type_spec();
				setState(151); match(IDENT);
				setState(152); match(T__14);
				setState(153); match(T__9);
				setState(154); match(T__13);
				System.out.println("Rule 11-2");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MiniCParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(MiniCParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stmt);
		try {
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); match(IF);
				setState(160); match(T__5);
				setState(161); expr(0);
				setState(162); match(T__4);
				setState(163); stmt();
				System.out.println("Rule 12-1");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); match(IF);
				setState(167); match(T__5);
				setState(168); expr(0);
				setState(169); match(T__4);
				setState(170); stmt();
				setState(171); match(ELSE);
				setState(172); stmt();
				System.out.println("Rule 12-2");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniCParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_stmt);
		try {
			setState(185);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); match(RETURN);
				setState(178); match(T__13);
				System.out.println("Rule 13-1");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); match(RETURN);
				setState(181); expr(0);
				setState(182); match(T__13);
				System.out.println("Rule 13-2");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode GE() { return getToken(MiniCParser.GE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(MiniCParser.LE, 0); }
		public TerminalNode AND() { return getToken(MiniCParser.AND, 0); }
		public TerminalNode EQ() { return getToken(MiniCParser.EQ, 0); }
		public TerminalNode OR() { return getToken(MiniCParser.OR, 0); }
		public TerminalNode NE() { return getToken(MiniCParser.NE, 0); }
		public TerminalNode LITERAL() { return getToken(MiniCParser.LITERAL, 0); }
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(188); match(IDENT);
				setState(189); match(T__11);
				setState(190); expr(22);
				System.out.println("Rule 14-1");
				}
				break;
			case 2:
				{
				setState(193); match(T__7);
				setState(194); expr(7);
				System.out.println("Rule 14-16");
				}
				break;
			case 3:
				{
				setState(197); match(T__0);
				setState(198); expr(6);
				System.out.println("Rule 14-17");
				}
				break;
			case 4:
				{
				setState(201); match(T__2);
				setState(202); expr(5);
				System.out.println("Rule 14-18");
				}
				break;
			case 5:
				{
				setState(205); match(IDENT);
				setState(206); match(T__14);
				setState(207); expr(0);
				setState(208); match(T__9);
				setState(209); match(T__11);
				setState(210); expr(0);
				System.out.println("Rule 14-2");
				}
				break;
			case 6:
				{
				setState(213); match(T__5);
				setState(214); expr(0);
				setState(215); match(T__4);
				System.out.println("Rule 14-19");
				}
				break;
			case 7:
				{
				setState(218); match(IDENT);
				System.out.println("Rule 14-20");
				}
				break;
			case 8:
				{
				setState(220); match(IDENT);
				setState(221); match(T__14);
				setState(222); expr(0);
				setState(223); match(T__9);
				System.out.println("Rule 14-21");
				}
				break;
			case 9:
				{
				setState(226); match(LITERAL);
				System.out.println("Rule 14-22");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(295);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(231); match(OR);
						setState(232); expr(21);
						System.out.println("Rule 14-3");
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(236); match(EQ);
						setState(237); expr(20);
						System.out.println("Rule 14-4");
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(241); match(NE);
						setState(242); expr(19);
						System.out.println("Rule 14-5");
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(246); match(LE);
						setState(247); expr(18);
						System.out.println("Rule 14-6");
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(251); match(T__12);
						setState(252); expr(17);
						System.out.println("Rule 14-7");
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(256); match(GE);
						setState(257); expr(16);
						System.out.println("Rule 14-8");
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(261); match(T__8);
						setState(262); expr(15);
						System.out.println("Rule 14-9");
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(266); match(AND);
						setState(267); expr(14);
						System.out.println("Rule 14-10");
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(271); match(T__2);
						setState(272); expr(13);
						System.out.println("Rule 14-11");
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(276); match(T__0);
						setState(277); expr(12);
						System.out.println("Rule 14-12");
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(281); match(T__3);
						setState(282); expr(11);
						System.out.println("Rule 14-13");
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(286); match(T__16);
						setState(287); expr(10);
						System.out.println("Rule 14-14");
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(291); match(T__6);
						setState(292); expr(9);
						System.out.println("Rule 14-15");
						}
						break;
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			setState(311);
			switch (_input.LA(1)) {
			case T__7:
			case T__5:
			case T__2:
			case T__0:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(300); expr(0);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(301); match(T__1);
					setState(302); expr(0);
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				System.out.println("Rule 15-1");
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				System.out.println("Rule 15-2");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 20);
		case 1: return precpred(_ctx, 19);
		case 2: return precpred(_ctx, 18);
		case 3: return precpred(_ctx, 17);
		case 4: return precpred(_ctx, 16);
		case 5: return precpred(_ctx, 15);
		case 6: return precpred(_ctx, 14);
		case 7: return precpred(_ctx, 13);
		case 8: return precpred(_ctx, 12);
		case 9: return precpred(_ctx, 11);
		case 10: return precpred(_ctx, 10);
		case 11: return precpred(_ctx, 9);
		case 12: return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u013c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\5\5D\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7Q\n\7\f\7\16\7T\13\7\3\7"+
		"\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bf\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tw\n\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u0086"+
		"\n\f\f\f\16\f\u0089\13\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f\13\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a0\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00b2\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bc"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00e7\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u012a"+
		"\n\20\f\20\16\20\u012d\13\20\3\21\3\21\3\21\7\21\u0132\n\21\f\21\16\21"+
		"\u0135\13\21\3\21\3\21\3\21\5\21\u013a\n\21\3\21\2\3\36\22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\2\u0152\2#\3\2\2\2\4/\3\2\2\2\6=\3\2\2"+
		"\2\bC\3\2\2\2\nE\3\2\2\2\fY\3\2\2\2\16e\3\2\2\2\20v\3\2\2\2\22x\3\2\2"+
		"\2\24|\3\2\2\2\26\u0083\3\2\2\2\30\u009f\3\2\2\2\32\u00b1\3\2\2\2\34\u00bb"+
		"\3\2\2\2\36\u00e6\3\2\2\2 \u0139\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2"+
		"\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\b\2\1\2(\3\3\2\2\2)*\5\6\4\2*+\b"+
		"\3\1\2+\60\3\2\2\2,-\5\n\6\2-.\b\3\1\2.\60\3\2\2\2/)\3\2\2\2/,\3\2\2\2"+
		"\60\5\3\2\2\2\61\62\5\b\5\2\62\63\7 \2\2\63\64\7\6\2\2\64\65\b\4\1\2\65"+
		">\3\2\2\2\66\67\5\b\5\2\678\7 \2\289\7\5\2\29:\7\n\2\2:;\7\6\2\2;<\b\4"+
		"\1\2<>\3\2\2\2=\61\3\2\2\2=\66\3\2\2\2>\7\3\2\2\2?@\7\24\2\2@D\b\5\1\2"+
		"AB\7\25\2\2BD\b\5\1\2C?\3\2\2\2CA\3\2\2\2D\t\3\2\2\2EF\5\b\5\2FG\7 \2"+
		"\2GH\7\16\2\2HI\5\f\7\2IJ\7\17\2\2JK\5\26\f\2KL\b\6\1\2L\13\3\2\2\2MR"+
		"\5\16\b\2NO\7\21\2\2OQ\5\16\b\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2"+
		"\2SU\3\2\2\2TR\3\2\2\2UV\b\7\1\2VZ\3\2\2\2WX\7\24\2\2XZ\b\7\1\2YM\3\2"+
		"\2\2YW\3\2\2\2Z\r\3\2\2\2[\\\5\b\5\2\\]\7 \2\2]^\b\b\1\2^f\3\2\2\2_`\5"+
		"\b\5\2`a\7 \2\2ab\7\5\2\2bc\7\n\2\2cd\b\b\1\2df\3\2\2\2e[\3\2\2\2e_\3"+
		"\2\2\2f\17\3\2\2\2gh\5\22\n\2hi\b\t\1\2iw\3\2\2\2jk\5\26\f\2kl\b\t\1\2"+
		"lw\3\2\2\2mn\5\32\16\2no\b\t\1\2ow\3\2\2\2pq\5\24\13\2qr\b\t\1\2rw\3\2"+
		"\2\2st\5\34\17\2tu\b\t\1\2uw\3\2\2\2vg\3\2\2\2vj\3\2\2\2vm\3\2\2\2vp\3"+
		"\2\2\2vs\3\2\2\2w\21\3\2\2\2xy\5\36\20\2yz\7\6\2\2z{\b\n\1\2{\23\3\2\2"+
		"\2|}\7\26\2\2}~\7\16\2\2~\177\5\36\20\2\177\u0080\7\17\2\2\u0080\u0081"+
		"\5\20\t\2\u0081\u0082\b\13\1\2\u0082\25\3\2\2\2\u0083\u0087\7\4\2\2\u0084"+
		"\u0086\5\30\r\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008c\5\20\t\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\t\2\2\u0091\u0092\b\f\1\2\u0092\27\3\2\2\2\u0093\u0094\5\b\5"+
		"\2\u0094\u0095\7 \2\2\u0095\u0096\7\6\2\2\u0096\u0097\b\r\1\2\u0097\u00a0"+
		"\3\2\2\2\u0098\u0099\5\b\5\2\u0099\u009a\7 \2\2\u009a\u009b\7\5\2\2\u009b"+
		"\u009c\7\n\2\2\u009c\u009d\7\6\2\2\u009d\u009e\b\r\1\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u0093\3\2\2\2\u009f\u0098\3\2\2\2\u00a0\31\3\2\2\2\u00a1\u00a2"+
		"\7\27\2\2\u00a2\u00a3\7\16\2\2\u00a3\u00a4\5\36\20\2\u00a4\u00a5\7\17"+
		"\2\2\u00a5\u00a6\5\20\t\2\u00a6\u00a7\b\16\1\2\u00a7\u00b2\3\2\2\2\u00a8"+
		"\u00a9\7\27\2\2\u00a9\u00aa\7\16\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac"+
		"\7\17\2\2\u00ac\u00ad\5\20\t\2\u00ad\u00ae\7\30\2\2\u00ae\u00af\5\20\t"+
		"\2\u00af\u00b0\b\16\1\2\u00b0\u00b2\3\2\2\2\u00b1\u00a1\3\2\2\2\u00b1"+
		"\u00a8\3\2\2\2\u00b2\33\3\2\2\2\u00b3\u00b4\7\31\2\2\u00b4\u00b5\7\6\2"+
		"\2\u00b5\u00bc\b\17\1\2\u00b6\u00b7\7\31\2\2\u00b7\u00b8\5\36\20\2\u00b8"+
		"\u00b9\7\6\2\2\u00b9\u00ba\b\17\1\2\u00ba\u00bc\3\2\2\2\u00bb\u00b3\3"+
		"\2\2\2\u00bb\u00b6\3\2\2\2\u00bc\35\3\2\2\2\u00bd\u00be\b\20\1\2\u00be"+
		"\u00bf\7 \2\2\u00bf\u00c0\7\b\2\2\u00c0\u00c1\5\36\20\30\u00c1\u00c2\b"+
		"\20\1\2\u00c2\u00e7\3\2\2\2\u00c3\u00c4\7\f\2\2\u00c4\u00c5\5\36\20\t"+
		"\u00c5\u00c6\b\20\1\2\u00c6\u00e7\3\2\2\2\u00c7\u00c8\7\23\2\2\u00c8\u00c9"+
		"\5\36\20\b\u00c9\u00ca\b\20\1\2\u00ca\u00e7\3\2\2\2\u00cb\u00cc\7\21\2"+
		"\2\u00cc\u00cd\5\36\20\7\u00cd\u00ce\b\20\1\2\u00ce\u00e7\3\2\2\2\u00cf"+
		"\u00d0\7 \2\2\u00d0\u00d1\7\5\2\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\7"+
		"\n\2\2\u00d3\u00d4\7\b\2\2\u00d4\u00d5\5\36\20\2\u00d5\u00d6\b\20\1\2"+
		"\u00d6\u00e7\3\2\2\2\u00d7\u00d8\7\16\2\2\u00d8\u00d9\5\36\20\2\u00d9"+
		"\u00da\7\17\2\2\u00da\u00db\b\20\1\2\u00db\u00e7\3\2\2\2\u00dc\u00dd\7"+
		" \2\2\u00dd\u00e7\b\20\1\2\u00de\u00df\7 \2\2\u00df\u00e0\7\5\2\2\u00e0"+
		"\u00e1\5\36\20\2\u00e1\u00e2\7\n\2\2\u00e2\u00e3\b\20\1\2\u00e3\u00e7"+
		"\3\2\2\2\u00e4\u00e5\7!\2\2\u00e5\u00e7\b\20\1\2\u00e6\u00bd\3\2\2\2\u00e6"+
		"\u00c3\3\2\2\2\u00e6\u00c7\3\2\2\2\u00e6\u00cb\3\2\2\2\u00e6\u00cf\3\2"+
		"\2\2\u00e6\u00d7\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e6\u00de\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u012b\3\2\2\2\u00e8\u00e9\f\26\2\2\u00e9\u00ea\7"+
		"\32\2\2\u00ea\u00eb\5\36\20\27\u00eb\u00ec\b\20\1\2\u00ec\u012a\3\2\2"+
		"\2\u00ed\u00ee\f\25\2\2\u00ee\u00ef\7\36\2\2\u00ef\u00f0\5\36\20\26\u00f0"+
		"\u00f1\b\20\1\2\u00f1\u012a\3\2\2\2\u00f2\u00f3\f\24\2\2\u00f3\u00f4\7"+
		"\37\2\2\u00f4\u00f5\5\36\20\25\u00f5\u00f6\b\20\1\2\u00f6\u012a\3\2\2"+
		"\2\u00f7\u00f8\f\23\2\2\u00f8\u00f9\7\34\2\2\u00f9\u00fa\5\36\20\24\u00fa"+
		"\u00fb\b\20\1\2\u00fb\u012a\3\2\2\2\u00fc\u00fd\f\22\2\2\u00fd\u00fe\7"+
		"\7\2\2\u00fe\u00ff\5\36\20\23\u00ff\u0100\b\20\1\2\u0100\u012a\3\2\2\2"+
		"\u0101\u0102\f\21\2\2\u0102\u0103\7\35\2\2\u0103\u0104\5\36\20\22\u0104"+
		"\u0105\b\20\1\2\u0105\u012a\3\2\2\2\u0106\u0107\f\20\2\2\u0107\u0108\7"+
		"\13\2\2\u0108\u0109\5\36\20\21\u0109\u010a\b\20\1\2\u010a\u012a\3\2\2"+
		"\2\u010b\u010c\f\17\2\2\u010c\u010d\7\33\2\2\u010d\u010e\5\36\20\20\u010e"+
		"\u010f\b\20\1\2\u010f\u012a\3\2\2\2\u0110\u0111\f\16\2\2\u0111\u0112\7"+
		"\21\2\2\u0112\u0113\5\36\20\17\u0113\u0114\b\20\1\2\u0114\u012a\3\2\2"+
		"\2\u0115\u0116\f\r\2\2\u0116\u0117\7\23\2\2\u0117\u0118\5\36\20\16\u0118"+
		"\u0119\b\20\1\2\u0119\u012a\3\2\2\2\u011a\u011b\f\f\2\2\u011b\u011c\7"+
		"\20\2\2\u011c\u011d\5\36\20\r\u011d\u011e\b\20\1\2\u011e\u012a\3\2\2\2"+
		"\u011f\u0120\f\13\2\2\u0120\u0121\7\3\2\2\u0121\u0122\5\36\20\f\u0122"+
		"\u0123\b\20\1\2\u0123\u012a\3\2\2\2\u0124\u0125\f\n\2\2\u0125\u0126\7"+
		"\r\2\2\u0126\u0127\5\36\20\13\u0127\u0128\b\20\1\2\u0128\u012a\3\2\2\2"+
		"\u0129\u00e8\3\2\2\2\u0129\u00ed\3\2\2\2\u0129\u00f2\3\2\2\2\u0129\u00f7"+
		"\3\2\2\2\u0129\u00fc\3\2\2\2\u0129\u0101\3\2\2\2\u0129\u0106\3\2\2\2\u0129"+
		"\u010b\3\2\2\2\u0129\u0110\3\2\2\2\u0129\u0115\3\2\2\2\u0129\u011a\3\2"+
		"\2\2\u0129\u011f\3\2\2\2\u0129\u0124\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\37\3\2\2\2\u012d\u012b\3\2\2"+
		"\2\u012e\u0133\5\36\20\2\u012f\u0130\7\22\2\2\u0130\u0132\5\36\20\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\b\21\1\2\u0137"+
		"\u013a\3\2\2\2\u0138\u013a\b\21\1\2\u0139\u012e\3\2\2\2\u0139\u0138\3"+
		"\2\2\2\u013a!\3\2\2\2\24%/=CRYev\u0087\u008d\u009f\u00b1\u00bb\u00e6\u0129"+
		"\u012b\u0133\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}