int func1 (int a,int b){
    int result;
    result = 0;
    while (a> 0){if (a/ b )
        {result=result+1;}
        a =a%b;
    }
    return result;
}

int main(void){
    int a;int b;int result;
    a=256;b=2;
    result= func1 (a,   b);
    return 0;
}
