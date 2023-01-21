//Giovanni Acireale, Assignment 2, 1/25/21
#include <stdio.h>
#include <stdlib.h>

main() {
	int First;
	int Second; //variables for the integers

	printf("Enter the first number: ");
	scanf_s("%i", &First); //Records input of first integer
	printf("You entered %i \n", First);

	printf("Enter the second number: ");
	scanf_s("%i", &Second); //Records input of second integer
	printf("You entered %i \n", Second);

	printf("\n");

	int Difference = First - Second;
	int Product = First * Second;
	int sqFirst = First * First;
	int sqSecond = Second * Second;

	//each desired equation from the assignment

	printf("The difference is %i \n", Difference);
	printf("The product is %i \n", Product);
	printf("The square of %i is %i \n", First, sqFirst);
	printf("The square of %i is %i \n", Second, sqSecond);

	//displays the output of the equations

	system("pause");
}