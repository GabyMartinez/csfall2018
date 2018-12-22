#include <stdio.h>

int prompt(); 

int operand(); 

int calculate(int a, int b, int operation); 


int main(){ 

  //This function is complete. Do not change it. 

  int code, op1, op2; 

  code = prompt(); 

  while(code != 3){ 

    op1 = operand(); 

    op2 = operand(); 

    if(code == 2 && op2 == 0) 

      printf("Division by zero is not allowed.\n"); 

    else 

      printf("The result is: %d\n", calculate(op1, op2, code)); 

    code = prompt(); 

  } 

  printf("The program is terminated.\n"); 

} 

int prompt(){ 
    //Complete this function. 
    int i;
    printf("enter 1 the program makes multiplication.\n");
    printf("enter 2 the program makes division.\n");
    printf("enter 3 the program terminates its execution.\n");
    scanf("%i",&i);
    if(i<1 || i>3){ //check if 1 or 3 works
        printf("enter 1, 2 or 3\n"); 
        prompt();
    }
    else
        return i;
} 

int operand(){ 
    //Complete this function. 
    //prompts the user to enter a number for one operand and returns this number
    int i;
    printf("enter a number: ");
    scanf("%i",&i);
    return i;
} 

int calculate(int a, int b, int operation){ 
    //Complete this function. 
    /* It returns the result of either multiplication or division. 
    If the value of the operation is 1 it returns the result of a multiplication otherwise returns the result of a division. */
    if(operation == 1){
        return a*b;
    }
    else{
        return a/b;
    }

} 