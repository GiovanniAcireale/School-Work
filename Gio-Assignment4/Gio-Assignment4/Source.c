//Giovanni Acireale, Assignment 4, 3/1/21
#include <stdio.h>
#include <stdlib.h>

main() {

	double w; //Package Weight
	double r; //Rate per 500 miles
	double shipping; //Total shipping cost

	int m; //miles shipped

	printf("Welcome to Global Courier Services! \n");
	printf("Please enter the distance in miles you would like to ship your package: \n");
	scanf_s("%d", &m); //miles input

	printf("Great! now please enter the weight of your Package in pounds: \n");
	scanf_s("%lf", &w); //weight input

	//case for packages over 50 lbs
	if (w > 50) {
		printf("Sorry, we only ship packages of 50 pounds or less. \n");
		system("pause");
	}

	//case for less than 10 lbs
	if (w <= 10) {
		r = 3;
		if (m % 500 == 0) {
			shipping = (m / 500) * r;
			//case for when distance exceeds 1000 miles
			if (m > 1000) {
				shipping = shipping + 10;
			}
		}
		else {
			shipping = (m / 500 + 1) * r;
			if (m > 1000) {
				shipping = shipping + 10;
			}
		}
	}

	//case for over 10 lbs but under or equal to 50 lbs
	if (w > 10 && w <= 50) {
		r = 5;
		if (m % 500 == 0) {
			shipping = (m / 500) * r;
			if (m > 1000) {
				shipping = shipping + 10;
			}
		}
		else {
			shipping = (m / 500 + 1) * r;
			if (m > 1000) {
				shipping = shipping + 10;
			}
		}
	}

	//print total shipping cost results
	printf("Your shipping charge is: $%.2lf \n", shipping);
	system("pause");
}