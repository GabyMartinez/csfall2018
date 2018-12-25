#include <stdio.h>

int main() {
	int total=100,adjustment,counter=0;
	
	printf("START WITH 100. ADJUSTMENT BETWEEN -20 AND 20\n");
	printf("What is your adjustment?");
	scanf("%i", &adjustment);
	
	while(total > 5){
		if(adjustment <= 20 && adjustment >= -20){
			total = total+adjustment;
			printf("TOTAL:%i\n",total);
			
		}
		else
			printf("NOT AN INTEGER BETWEEN -20 AND 20");
			
		counter++;
		
		if(total !=5){
			printf("adjustment?");
			scanf("%i", &adjustment);
		}
	}
	
	printf("THE GAME IS WON IN %i STEPS", counter);
	
	
	return 0;
}
