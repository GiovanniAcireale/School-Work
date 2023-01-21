//Giovanni Acireale, Assignment 6, 3/22/21

#include <stdlib.h>
#include <stdio.h>


main()
{

    int multiplier, x, y;
    multiplier = 5;
    x = 1;
    //multiplier is the multiple 5, x is the counter variable, and y is the value being manipulated
 
    do 
    {
        y = x * multiplier;
        x++;
        printf("%i, ", y);
    } 
    while (y < 60);

    printf("\n");

    int output = 0;

    while (output < 200) 
    {
        output++;

        if (output % 2 == 0 && output % 7 == 0) //using remainders equal to zero to list every valid number less than 200
        {
            printf("%i ", output);
        }
    }

    printf("\n");

    int num;
    int sum = 0;

    for (num = 101; num < 500; num++)//for loop setting bounds
    {
        if (num % 8 == 0)//if number is divisible by 8
        {
            sum += num;//increment sum by num
        }
    }

    printf("%i \n", sum);

    int z = 0;
    int start = 20;
    int end = 100;

    while (start <= end)
    {
        if (start % 2 != 0)//if start is not divisible by 2
        {
            z += start;//increment z by start
        }
        start++;//start keeps increasing until it reaches end value
    }

    printf("%i \n", z);

    system("pause");
}