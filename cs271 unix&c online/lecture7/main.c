#include <stdio.h>
float calculate(float income)
{
	if (income < 30000)
		return 0;
	else if (income < 100000)
		return 15.0/100 * income;
	else
		return 25.0/100 * income;
}

int main()
{
    char name[100];
    float income, tax;

    printf("Please enter your name: ");
    gets(name);
    printf("\nPlease enter your income: ");
    scanf("%f", &income);
    tax = calculate(income);
    printf("\n%s pay $%.2f for your tax.\n", name, tax);
}
