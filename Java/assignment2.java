public class assignment2 
{
    public static void main(String[] strings) 
    {

        double birth = 7.0;
        //One birth every 7 seconds
        double death = 13.0;
        //One death every 45 seconds
        double immigrant = 45.0;
        //One new immigrant every 45 seconds
        int pop = 312032486;
        //Assume the current population is 312,032,486

        //seconds in an hour: 60 * 60 = 3,600
        //seconds in a day: 3,600 * 24 = 86,400
        //seconds in a year: 86,400 * 365 = 31,536,000
        double year = 31536000.0;

        //prints before looping
        System.out.println("Starting Population: " + pop);

        //rates of births, deaths, and immigrants per second in a year
        double birthRate = year / birth;
        double deathRate = year / death;
        double immigRate = year / immigrant;

        //for loop that loops 5 times
        for (int i = 1; i <= 5; i++) 
        {
            pop += birthRate + immigRate - deathRate;
            System.out.println("Year " + i + ": " + (int)pop);
            //displays results
        }
    }
}