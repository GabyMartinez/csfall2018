/*Write a program to enter an integer for n. 
If n is negative, make it positive. 
If n is an even number incremented to become an odd number. 
The program should display a triangle of stars such that 1 star on the first line, 
3 stars on the next line, 5 stars on the next line,…, n stars on the last line. 
*/

#include <stdio.h>

void main(){
    int n,i,row;

    printf("enter an integer: ");
    scanf("%d",&n);

    if(n<0)
        n=n*-1;

    if(n%2==0)
        n=n+1;
  
    for (row=1; row<=(n/2)+1; row++)
    {    
        for (i=1; i<=(2*row)-1; i++)
            printf("*");
    
        printf("\n");
    }

}