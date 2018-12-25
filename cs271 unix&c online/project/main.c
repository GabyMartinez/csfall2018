#include <stdio.h>
#include <stdlib.h>

int main() {

    int day, month, year;
	printf("enter a date: ");
	scanf("%i/%i/%i", &month, &day, &year);

	if(day != 0){
        switch(month){
            case 2: if(day <= 29){
                      printf("date valid: %i/%i/%i", month, day, year);
                    } break;
            case 4: case 5: case 6: case 9: case 11:
                    if(day <= 30){
                      printf("date valid: %i/%i/%i", month, day, year);
                    } break;
            case 8: case 1: case 3: case 7: case 10: case 12:
                    if(day <= 31){
                      printf("date valid: %i/%i/%i", month, day, year);
                    } break;
            default: printf("date invalid: %i/%i/%i", month, day, year);
                        exit(0);
        }
    }
    else
        printf("date invalid: %i/%i/%i", month, day, year);
}


