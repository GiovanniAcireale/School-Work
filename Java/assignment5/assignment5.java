package assignment5;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class assignment5 
{

    //define the main method
    public static void main(String[] args)
    {
        //create a scanner object
        Scanner sc = new Scanner(System.in);

        //prompt and in the year
        System.out.println("Enter the year: ");
        String year = sc.next();

        //prompt and in the gender
        System.out.println("Enter the gender (M or F): ");
        String gender = sc.next();

        //prompt and in the name
        System.out.println("Enter the name: ");
        String name = sc.next();

        //close the scanner object
        sc.close();

        //create a file object and open the input file
        File file = new File("babynamesranking" + year + ".txt");
/*
        if (file.exists()) 
        {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable " + file.canRead());
            System.out.println("File size in bytes " + file.length());
        } 
        else 
        {
            System.out.println("The file does not exist.");
        }
*/
        //if file does not open properly, then exit
        if (!file.exists())
        {
            System.out.println("No record for " + year);
            System.exit(1);
        }

        int rank = 0;

        try
        {
            //create a scanner for file
            Scanner in = new Scanner(file);

            //read the input text file
            while (in.hasNext())
            {

                //read the line
                String line = in.nextLine();

                //split the line with each tab in an array
                String[] array = line.split("\t");

                //if gender = M and array[1] == name, change rank to array[0]
                if (gender.equalsIgnoreCase("M") && array[1].contentEquals(name))
                    rank = Integer.valueOf(array[0]);

                //if gender = F and array[3] == name, change rank to array[0]
                else if (gender.equalsIgnoreCase("F") && array[3].contentEquals(name))
                    rank = Integer.valueOf(array[0]);
            }

            in.close();

        }

        //catch the exception
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        //if the rank is 0, the name doesn't exist
        if (rank == 0)
        {
            System.out.println("The name " + name + " was not found in year " + year);
        }

        else
        {
            //Correct output
            System.out.println(name + " is ranked #" + rank + " in year " + year);
        }
    }
}
