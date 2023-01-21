//Giovanni Acireale, Assignment 8, 4/12/21
#include<stdlib.h>
#include<stdio.h>

main()
{
	int n1;
	int n2;
	int n3;
	int n4;
	int n5;

	int choice;

	int smallest;
	int largest;
	int sum;

	double av;

//The hard way:
/*
	printf("Enter five positive numbers seperated by the enter button:\n");
	scanf_s("%i", &n1);
	if (n1 < 0)
	{
		printf("\nERROR! Negative number entered!");
		system("pause");
		exit(0);
	}
	scanf_s("%i", &n2);
	if (n2 < 0)
	{
		printf("\nERROR! Negative number entered!");
		system("pause");
		exit(0);
	}
	scanf_s("%i", &n3);
	if (n3 < 0)
	{
		printf("\nERROR! Negative number entered!");
		system("pause");
		exit(0);
	}
	scanf_s("%i", &n4);
	if (n4 < 0)
	{
		printf("\nERROR! Negative number entered!");
		system("pause");
		exit(0);
	}
	scanf_s("%i", &n5);
	if (n5 < 0)
	{
		printf("\nERROR! Negative number entered!");
		system("pause");
		exit(0);
	}
*/

//Easy Mode:
	printf("Enter five positive numbers seperated by the enter button:\n");
	scanf_s("%i", &n1);
	scanf_s("%i", &n2);
	scanf_s("%i", &n3);
	scanf_s("%i", &n4);
	scanf_s("%i", &n5);

	if (n1 < 0 || n2 < 0 || n3 < 0 || n4 < 0 || n5 < 0) //Checks if each int is positive 
	{
		printf("\nERROR! Negative number entered!");
		system("pause");
		exit(0);
	}

//The Menu
	printf("\nPlease select an option:\n\n");
	printf("1. Display the smallest number\n");
	printf("2. Display the largest number\n");
	printf("3. Display the Sum of the five numbers entered\n");
	printf("4. Display the average of the five numbers entered\n\n");

	scanf_s("%i", &choice);

//The Switch
	switch (choice)
	{
	case 1://1. Display the smallest number entered
//figured I'd do it the hard way and compare each individual one since I didn't put the 5 inputs as an array
		if ((n1 < n2) && (n1 < n3) && (n1 < n4) && (n1 < n5))
		{
			smallest = n1;
		}
		else if ((n2 < n1) && (n2 < n3) && (n2 < n4) && (n2 < n5))
		{
			smallest = n2;
		}
		else if ((n3 < n1) && (n3 < n2) && (n3 < n4) && (n3 < n5))
		{
			smallest = n3;
		}
		else if ((n4 < n1) && (n4 < n2) && (n4 < n3) && (n4 < n5))
		{
			smallest = n4;
		}
		else
		{
			smallest = n5;
		}

		printf("\nThe smallest number entered was %i\n", smallest);

		break;
		
	case 2://2. Display the largest number entered
//same deal as case 1
		if ((n1 > n2) && (n1 > n3) && (n1 > n4) && (n1 > n5))
		{
			largest = n1;
		}
		else if ((n2 > n1) && (n2 > n3) && (n2 > n4) && (n2 > n5))
		{
			largest = n2;
		}
		else if ((n3 > n1) && (n3 > n2) && (n3 > n4) && (n3 > n5))
		{
			largest = n3;
		}
		else if ((n4 > n1) && (n4 > n2) && (n4 > n3) && (n4 > n5))
		{
			largest = n4;
		}
		else
		{
			largest = n5;
		}

		printf("\nThe largest number entered was %i\n", largest);

		break;

	case 3://3. Display the sum of the five numbers entered

		sum = n1 + n2 + n3 + n4 + n5;

		printf("\nThe sum of the numbers entered is %i\n", sum);

		break;

	case 4://4. Display the average of the five numbers entered

		av = ((double)n1 + (double)n2 + (double)n3 + (double)n4 + (double)n5) / 5;

		printf("\nThe average of the numbers entered is %.2f\n", av);

		break;

	default://anything not 1, 2, 3, or 4

		printf("Your choice was invalid!\n");

		break;
	}

	system("pause");
}