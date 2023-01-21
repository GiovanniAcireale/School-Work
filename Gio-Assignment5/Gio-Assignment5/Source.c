//Giovanni Acireale, Assignment 5, 3/8/21

#include <stdlib.h>
#include <stdio.h>


main()
{
	int score; //scores
	int pass = 0; //amount of passing scores
	int valid = 0; //amount of valid scores
	double percent; //percent of passing valid scores

	printf("Enter a test score (-1 to quit): ");
	scanf_s("%d", &score); //user input of grades

	while (score != -1) //while loop for user input until user enters -1
	{
		//determines if the score counts as a passing grade
		if (score <= 100 && score >= 70)
		{
			pass++; //adds 1 to the pass counter variable
		}
		//detremines if the score is invalid
		if (score > 100 || score < -1)
		{
			printf("That is not a valid grade!\n");
		}
		//determines if the score is valid
		if (score >= 0 && score <= 100)
		{
			valid++; //adds 1 to valid counter variable
		}

		printf("Enter another test score (-1 to quit): ");
		scanf_s("%d", &score); //user input for grades within the while loop

	}

	printf("You entered %i passing grades.\n", pass);

	//equation for finding the percentage of passing valid scores
	percent = (pass * 100) / valid; 

	printf("%.1f%% of the valid grades entered are passing grades.\n", percent);

	system("pause");
}

/*
main()
{
	int a = 5, b = 4, c = 3, d = 2;

	printf("(a <= b + 1)\n");

	if (a <= b + 1)
	{
		printf("True\n");
	}
	else
	{
		printf("False\n");
	}

	printf("(a < b && c > b)\n");

	if (a < b && c > b)
	{
		printf("True\n");
	}
	else
	{
		printf("False\n");
	}

	printf("(a >= c || d >= 5)\n");

	if (a >= c || d >= 5)
	{
		printf("True\n");
	}
	else
	{
		printf("False\n");
	}

	printf("(!(a > b))\n");

	if (!(a > b))
	{
		printf("True\n");
	}
	else
	{
		printf("False\n");
	}

	printf("(b >= a && !(d < b))\n");

	if (b >= a && !(d < b))
	{
		printf("True\n");
	}
	else
	{
		printf("False\n");
	}

	system("pause");
}
*/