#include <stdio.h>
//Write a program that reads 20 numbers from the keyboard and stores them in a file
//named b.txt on the hard drive.
int main()
{
    int i,x;
    FILE *outfile;
    outfile = fopen("b.txt","w");

    for(i=0;i<20;i++){
        scanf("%d",&x);
        fprintf(outfile, "%i. %d\n", i+1, x);
    }
    fclose(outfile);
    return 0;
}