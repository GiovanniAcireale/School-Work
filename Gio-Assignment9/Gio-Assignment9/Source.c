//Giovanni Acireale, Assignment 9, 4/19/21
#include<stdlib.h>
#include<stdio.h>

main() {

	//declare array gmsl with a size of 28, data includes the first gsml of recorded sea level for every year since 1993
	double gmsl[28] = { -38.57, -31.20, -26.03, -27.72, -26.31, -20.31, -25.29, -16.79, -14.73, -10.40, -5.15, -1.63, 0.72, 3.56, 5.28, 5.03, 8.70, 15.05, 10.02, 18.69, 28.52, 27.64, 33.32, 44.09, 42.14, 47.53, 51.53, 54.60 };
	float avg = 0;
	float sum = 0;
	int loop;
	
	//for loop determining the sum of all the values in the gmsl array
	for (loop = 0; loop < 28; loop++) {
		sum = sum + gmsl[loop];
	}

	//equation for the average annual change provided by the dataset
	avg = sum / loop;

	printf("The average annual change in sea level = %.2f\n", avg);

	//array for predictions for every 5 years between 2020 and 2050
	double pre[7];

	printf("\nThe predicted Global Mean Sea Levels based on a linear increase of the calculated average:\n\n");

	int loop2, year = 2020;

	//for loop using the average computed previously as the annual change for the future years in 5 year intervals
	for (loop2 = 0; loop2 < 7; loop2++) {
		pre[loop2] = ((avg * 5) * loop2) + (avg + gmsl[27]);
		printf("%d %.2f\n", year, pre[loop2]);
		year = year + 5;
	}

	printf("\nThese predictions were made using data provided by GSFC. 2020. \nGlobal Mean Sea Level Trend from Integrated Multi-Mission Ocean Altimeters \nTOPEX/Poseidon, Jason-1, OSTM/Jason-2, and Jason-3 Version 5.0 \nVer. 5.0 PO.DAAC, CA, USA. Dataset accessed [2021-04-19] at http://dx.doi.org/10.5067/GMSLM-TJ150.\n");

	return 0;
}