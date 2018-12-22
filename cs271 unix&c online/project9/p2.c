#include <stdio.h>

int main() {
	int count, i;
	float input, max=0, min=0;
	
	printf("How many numbers do you want to compare?");
	scanf("%i", &count);
//	printf("count=%i",count);
	
	for(i=0;i<count; i++){
		printf("enter a number:");
		scanf("%f", &input);
	//	printf("input=%f",input);
		
		if(i==0){ //sets min to first number entered
			min = input;
		//	printf("min=%f \n",min);
		}
		
		if(input>max){//compares max to input
			max = input; //input is new max
		//	printf("max=%f \n",max);
		}
		else if(input<min){//compares min to input
			min = input; //input is new min
		//	printf("min=%f \n",min);
		}
	}
	
	printf("the smallest number is: %f \n", min);
	printf("the largest number is: %f", max);
	
//	return 0;
}
