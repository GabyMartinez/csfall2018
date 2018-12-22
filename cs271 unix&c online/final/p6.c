#include <stdio.h> 
#include <string.h>
//check on linux VM
struct monthType{ 
    //array of type char with size: 
    char name[10]; 

    //of type int
    int days; 
}; 

int main() {
    struct monthType months[12];    // Array of structures of size: 12 
    int month,i;   // Month number input

    strcpy(months[0].name, "January");
    months[0].days=31;

    strcpy(months[1].name, "February");
    months[1].days=28;

    strcpy(months[2].name, "March");
    strcpy(months[3].name, "April");
    strcpy(months[4].name, "May");
    strcpy(months[5].name, "June");
    strcpy(months[6].name, "July");
    strcpy(months[7].name, "August");
    strcpy(months[8].name, "September");
    strcpy(months[9].name, "October");
    strcpy(months[10].name, "Novemeber");
    strcpy(months[11].name, "December");

    for(i=2;i<13;i++){
        if(i==2||i==4||i==6||i==7||i==9||i==11){
            months[i].days=31;
        }
        else if(i==3||i==5||i==8||i==10){
            months[i].days=30;
        }
    }

    printf("Which month?");
    scanf("%i",&month);

    if(month<1 || month>12){
        printf("Month number must be between 1 to 12 inclusive. ");
    }
    else{
        printf("%s, has %i days",months[month-1].name,months[month-1].days);
    }

    return 0;
}