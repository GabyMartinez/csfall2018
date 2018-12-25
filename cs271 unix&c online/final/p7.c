#include <stdio.h>
#include <stdlib.h>

//Write a program in C to dynamically allocate memory using built-in function malloc 
//to store n integer numbers entered by the user and then print them in reverse order. 

void main(){
    int *nums;
    int n,i;

    printf("How many numbers do you want to enter? ");
    scanf("%d", &n);
    
    nums = (int*)malloc(n * sizeof(int));
    for(i = 0; i < n; i++){
        printf("Enter an integer: ");
        scanf("%d", &nums[i]);
    }

    for(i=n-1;i>=0;i--){
        printf("%i ",nums[i]);
    }
}