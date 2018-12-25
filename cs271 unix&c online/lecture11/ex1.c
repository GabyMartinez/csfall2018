#include <stdio.h>
//A program to read a number from a file and displays it on the screen. 12/1/18

int main()
{
    FILE *myfile;
    int x;

    myfile = fopen("a.txt","r");
    fscanf(myfile, "%d", &x);
    printf("%d\n", x);
    fclose(myfile);
    
    return 0;
}
