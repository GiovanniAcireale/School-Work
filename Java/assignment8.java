import java.util.*;
import java.io.*;

class MainMenu
{
    // 1. Get the user’s first name and echo it back out 20 times.
    public static void echo(String firstName)
    {
        for(int i = 0; i < 20; i++)
            System.out.println(firstName);
    }
   
    // 2. Get the Store user’s age and double it and display the age and the doubled age.
    public static void doubleAge(int age)
    {
        int doubleAge = age * 2;
        System.out.println(" ");
        System.out.println("Your age is: " + age);
        System.out.println("Your age doubled is: " + doubleAge);

        // 3. Using the age from #2 output one of the following statements
        //   a. Since you are 99 years old, you are a teenager
        //   b. Since you are 99 years old, you are NOT a teenager
        if(age > 19 || age < 13)
        {
            System.out.println(" ");
            System.out.println("Since you are " + age + " years old, you are not a teenager.");
        }
        else  
        {
            System.out.println(" ");
            System.out.println("Since you are " + age + " years old, you are a teenager.");
        }
    }
   
    // 4. Get a single integer between 3 and 50 from the user. Create a triangle of X’s with
    //    the integer inputted rows. The triangle needs to be displayed on the screen and in a
    //    text document named triangle.txt.
    public static void triangle(int number) throws FileNotFoundException
    {
        if(number > 2 && number < 51)
        {
            System.out.println(" ");
            PrintWriter pw = new PrintWriter(new File("triangle.txt"));
            for(int i = 0; i < number; i++)
            {
                for(int j = -1; j < i; j++)
                {
                    System.out.print("*");
                    pw.write("*");
                }
                System.out.println();
                pw.write("\n");
            }
            pw.close();    
        }
        else
        {
            System.out.println(" ");
            System.out.println("Invalid integer, only integers between 3 and 50 allowed");
        }
    }
   
    // Main Menu display and switch statement
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(System.in);
        int i = 0;

        while(i == 0)
        {
            System.out.println(" ");
            System.out.println("Select an option: ");
            System.out.println(" ");
            System.out.println("1. Echo name 20 times.");
            System.out.println("2. Age doubler and teen-tester.");
            System.out.println("3. Create a '*' triangle.");
            System.out.println("4. Close");
            System.out.println(" ");
            System.out.print("You choose option: ");
            int option = in.nextInt();

            switch(option)
            {
                case 1:
                    System.out.println(" ");
                    System.out.print("Enter your first name: ");
                    String name = in.next();
                    echo(name);
                    break;
    
                case 2:
                    System.out.println(" ");
                    System.out.print("Enter your age: ");
                    int age = in.nextInt();
                    doubleAge(age);
                    break;
    
                case 3:
                    System.out.println(" ");
                    System.out.print("Enter an integer between 3 and 50: ");
                    int number = in.nextInt();
                    triangle(number);
                    break;

                case 4:
                    i++;
                    break;
    
                default:   
                    System.out.println(" ");
                    System.out.println("Invalid menu choice.");
           }
        }
        in.close();
        System.out.println(" ");
        System.out.println("Goodbye!");
    }
}