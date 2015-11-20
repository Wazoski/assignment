#include <stdio.h>
#include <stdlib.h>



int main(){
	FILE* fin;
	FILE* fout;

	fin = fopen("week10.txt","rt");
	fout = fopen("00_201302388_huffman.txt","wt");

	if(fin == NULL){
		printf("*** Input File open error ***");
		exit(1);
	}



	return 0;
}