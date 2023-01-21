import java.util.Scanner;

public class Account
{
    // ATM Machine
    // Simulate an ATM machine with 10 accounts with initial balance of $100.00
    // Ask the user to enter their account ID and then display a menu to show 
    // the current balance, make a deposit, withdraw funds, or exit.
    // The program will run continuously, as would a real-life ATM
    // Create a class name it “Account” that has all methods needed to 
    // accomplish the above requirements.

    private int id;
    private double balance;

    // holds each account's data
    public Account(int id) 
    {
        this.id = id;
        this.balance = 100;
    }

    // updates an accounts balance
    public void setBalance(double newBalance) 
    {
        balance = newBalance;
    }

    // returns account's balance
    public double getBalance() 
    {
        return balance;
    }

    // returns account ID
    public int getID() 
    {
        return id;
    }

    // withdraw function
    public double withDraw(double withDrawAmount) 
    {
        return balance = balance - withDrawAmount;
    }

    // deposit function
    public double deposit(double depositAmount) 
    {
        return balance = balance + depositAmount;
    }

    // Main
    public static void main(String[] args) 
    {
        //ID given by user input
        int userID;

        // while loop parameters
        boolean mainMenu = true;
        boolean validID = true;

        // Account array
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) 
        {
            accounts[i] = new Account(i);
        }

        Scanner input = new Scanner(System.in);

        // while loop
        do 
        {
            System.out.print("==  What is your account number? ");
            userID = input.nextInt();
            // if valid userID from Account array
            if (userID <= 9 && userID >=0 && userID == accounts[userID].getID()) 
            {
                // welcome message
                System.out.println("");
                System.out.println("==  Welcome Account Holder " + userID + "!");
                System.out.println("");

                // sets loop condition to repeat
                validID = true;
                // nested while loop
                do 
                {
                    // main menu
                    System.out.println("ATM Options:  (1) Balance  (2) Withdraw  (3) Deposit  (4) Exit");
                    System.out.print("Please select transaction: ");
                    int choice = input.nextInt();
                    System.out.println("");
                    // switch statement for the 4 main menu options
                    switch(choice) 
                    {
                        case 1:
                            // (1) Balance
                            System.out.println("==  Your current balance is $" + accounts[userID].getBalance());
                            System.out.println("");
                            break;
                        case 2:
                            // (2) Withdraw
                            System.out.print("==  Enter amount to withdraw: ");
                            int withdrawAmount = input.nextInt();
                            accounts[userID].withDraw(withdrawAmount);
                            System.out.println("==  Your new balance is $" + accounts[userID].getBalance());
                            System.out.println("");
                            break;
                        case 3:
                            // (3) Deposit
                            System.out.print("==  Enter amount to deposit: ");
                            int depositAmount = input.nextInt();
                            accounts[userID].deposit(depositAmount);
                            System.out.println("==  Your new balance is $" + accounts[userID].getBalance());
                            System.out.println("");
                            break;
                        case 4:
                            // (4) Exit
                            System.out.println("==  Sign off.");
                            System.out.println("==  Thank you for using our ATM. Come back soon!");
                            System.out.println("");

                            // necesssary for reseting userID and making loop continuous
                            System.out.print("==  What is your account number? ");
                            userID = input.nextInt();
                            if (userID <= 9 && userID >=0 && userID == accounts[userID].getID()) 
                            {
                                // repeats loop
                                validID = true;

                                System.out.println("");
                                System.out.println("==  Welcome Account Holder " + userID + "!");
                                System.out.println("");
                                continue;
                            }
                            else
                            {
                                System.out.println("==  Invalid account number. Please try again.");
                                // exits loop
                                validID = false;
                            }                
                            break;
                        default:
                            // input error
                            System.out.println("");
                            System.out.println("==  Invalid option. Please try again.");
                            System.out.println("");
                    }
                } while (validID);
            }
            else
            {
                System.out.println("==  Invalid account number. Please try again.");
            }
        }while(mainMenu);
        input.close();
    }
}