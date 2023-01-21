//Giovanni Acireale, Assignment 10, 4/23/21
#include<stdlib.h>
#include<stdio.h>

//Function going from Fahrenheit to Celsius
void tocel() {

    double fer;//Degrees Fahrenheit
    double ferRe;//Conversion Results

    printf("\nEnter the temperature in degrees Fahrenheit: ");
    scanf_s("%lf", &fer);

    ferRe = (5.0 / 9) * (fer - 32);//Conversion Formula

    printf("\n%.2lf degree F = %.2lf degree C\n\n", fer, ferRe);
}

//Function going from Celsius to Fahrenheit
void tofer() {

    double cel;//Degrees Celsius
    double celRe;//Conversion Results

    printf("\nEnter the temperature in degrees Celsius: ");
    scanf_s("%lf", &cel);

    celRe = (9.0 / 5) * cel + 32;//Conversion Formula

    printf("\n%.2lf degree C = %.2lf degree F\n\n", cel, celRe);
}

int main() {

    int option;

    while (1) {

        printf("1. Convert temperature input from the user in degrees Fahrenheit to degrees Celsius\n");
        printf("2. Convert temperature input from the user in degrees Celsius to degrees Fahrenheit \n");
        printf("3. Quit.\n");

        scanf_s("%d", &option);

        //Loop for options
        if (option == 3)
            break;

        else if (option == 1)
            tocel();

        else if (option == 2)
            tofer();
    }

    return 0;
}