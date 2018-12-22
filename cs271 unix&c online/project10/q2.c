#include <stdio.h>
/*
The program reads a positive number (maximum 100) for n and n decimal numbers from the keyboard into an array. 
The program then reads a positive integer for m and a decimal number for: x. 
The program inserts the value of x in subscript mth. 
Finally the program displays the content of the array.  
*/

int main(){
    float inputs[100];
    float in,temp;
    int index,i,n;

    scanf("%i",&index);
    if(index <= 100){ //check if within array index
        for(i=0;i<index;i++)
        {
            scanf("%f",&in);
            inputs[i]=in;
            // printf("%i. %f\n",i+1,inputs[i]); //check array
        }
    }
    else{
        printf("enter a number no more than 100");
    }

    scanf("%i",&index); //position for insert
    scanf("%f",&in); //value inserted

    for(n=i;n>=0;n--){ 
        if(n==index-1){
            temp = inputs[n]; //temp
            inputs[n] = in;
            inputs[n+1] = temp;
        }
        else if(n>index-1){
            inputs[n+1] = inputs[n]; //shift values over 1
        }
    }
    for(n=0;n<=i;n++) 
        printf("%f\t",inputs[n]); //print array

    return 0;
}