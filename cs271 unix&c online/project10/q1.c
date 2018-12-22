#include <stdio.h>
//Write a program to read all the characters (at most 1000) from an input file. The program should replace every space character by the last character.

int main(){
    char inputs[1000];
    char x;
    int b=0,i=0,n;
    FILE *infile;

    infile = fopen("a.txt","r");
    while(b != -1){
        b = fscanf(infile,"%c",&x);
        inputs[i] = x;
        i++;
    }

    for(n=0;n<=i;n++){
        if(inputs[n]==32){
            //printf(" space ");
            printf("%c",inputs[i-1]);
        }
        else
            printf("%c",inputs[n]);
    }
    fclose(infile);
    return 0;
}