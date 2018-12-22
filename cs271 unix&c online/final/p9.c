#include <stdio.h>
#include <stdlib.h>
#include <time.h> 

 
int main(){ 

    char x; 
    int i=1,a=0,b=0,c=0;
    srand((unsigned)time(NULL));
    
    while(i<=50){
        x = rand() % 3 + 65; 
        if(x==65){
            a++;
        }
        else if(x==66){
            b++;
        }
        else if(x==67)
            c++;

        printf("%c, ", x); 
        i++;
    }

    printf("\nNumber of A is: %i\n", a);
    printf("Number of B is: %i\n", b);
    printf("Number of C is: %i\n", c);
} 