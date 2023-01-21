//Giovanni Acireale, Assignment 7, 3/22/21
#include <stdio.h>
#include <stdlib.h>

main()
{
    int input;
    int largest;
    int number;
    int smallest;
    int count = 0;
    int sum = 0;

    double average;

    printf("Enter a positive number (-1 to quit):");
    scanf_s("%i", &input);

    while (input != -1)
    {

        if (input < -1)//error message for negative numbers
        {
            printf("\nError! Invalid number!\n\n");
            printf("Enter a positive number (-1 to quit):");
            scanf_s("%i", &input);
        }

        if (count == 0) //initializes each variable at the beginning of the loop
        {
            largest = input;
            number = input;
            smallest = input;
        }

        if (input >= largest)//if the input is greater than or equal to the previous largest input
        {
            largest = input;
            count++;//increase count
            sum += input;//increment sum by input

            printf("Enter another positive number (-1 to quit):");
            scanf_s("%i", &input);
        }

        if (input < largest && input > -1)
        {
            number = input;
            count++;//increase count
            sum += input;//increment sum by input


            if (input < smallest)
            {
                smallest = input;
            }

            printf("Enter another positive number (-1 to quit):");
            scanf_s("%i", &input);
        }

    }

    if (input == -1)
    {
        average = (double)sum / count;

        printf("The highest number was: %i\n", largest);
        printf("The lowest number was: %i\n", smallest);
        printf("The number of values entered was: %i\n", count);
        printf("The average of the numbers was: %.2lf\n", average);
    }

    system("pause");
}