#include <stdio.h>

int main(){
    char x;
//    char inputs[1000];
    int b;

    scanf("%c",&x);
    if(x==32){
        printf("space");
    }
    else
        printf("%c",x);

    return 0;
}