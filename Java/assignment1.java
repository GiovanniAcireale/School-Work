//import scanner
import java.util.Scanner;

class assignment1 {
    public static void main(String[] args) {

        //create new scanner named input
        Scanner input = new Scanner(System.in);
        
        //prints the request followed by integer inputs
        System.out.println("Enter your first number:"); 
        int x = input.nextInt();

        System.out.println("Enter your second number:"); 
        int y = input.nextInt();

        System.out.println("Enter your third number:"); 
        int z = input.nextInt();

        //closes scanner for input
        input.close();

        //equations for finding the sum and average
        int sum = x + y + z;
        int avg = sum/3;

        //final printout
        System.out.println("The three numbers are: " + x + ", " + y + ", and " + z); 
        System.out.println("The sum of the numbers is: " + sum); 
        System.out.println("The average of the numbers is: " + avg); 
    }
}