import java.text.DecimalFormat;
import java.util.Scanner;

public class assignment3
{
    public static void main(String[] args)
    {   
        //open scanner
        Scanner input = new Scanner(System.in);

        //input scans for loan amount
        System.out.print("Enter loan amount, for example 120000.95: ");
        double loan = input.nextDouble();

        //input scans for years
        System.out.print("Enter number of years as an integer, for example, 5: ");
        int years = input.nextInt();

        //close scanner
        input.close();

        //monthly payment
        double monthly = loan/(years*12);

        //base interest rate
        double interestRate = 5.000;

        //Decimal format for hundreds place
        DecimalFormat hund = new DecimalFormat("####0.00");
        //Decimal format for thousands place
        DecimalFormat thou = new DecimalFormat("####0.000");

        //first print
        System.out.println("Interest Rate   Monthly Payment   Total Payment");

        //while loop of outputs
        while(interestRate <= 8)
        {
            //formats monthlyPayment and totalPayment
            String monthlyPayment = hund.format(monthly + (monthly*interestRate*0.01));
            String totalPayment = hund.format(loan + (loan*interestRate*0.01));

            //prints output with all proper formating
            System.out.println(thou.format(interestRate) + "%          " + monthlyPayment + "            " + totalPayment);

            interestRate = interestRate + 0.125;
        }
    }
}