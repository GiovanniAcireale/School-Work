public class assignment4 
{
    
// S1 opens every L
// S2 closes every 2
// S3 close 3 and changes every 3rd
// S# (4-50) changes any L# / #
// S# (51 - 100) changes == L#

    public static void main(String[] args) 
    {
        //L# : i = #

        //creates boolean array
        boolean[] lockers = new boolean[100];
        //for(int i = 0; i < lockers.length; i++) 
        //{
            //automatically set to false
            //false is a closed L
            //System.out.println(lockers[i]);
            //System.out.println("L" + (i + 1) + (lockers[i]? " is open" : " is closed") + " (" + lockers[i] + ")");
        //}

        for (int i = 0; i < lockers.length; i++) 
        {
            for (int j = i; j < 100; j += i + 1) {
                //any locker equal to j
                lockers[j] = !lockers[j];
            }

            //System.out.println(lockers[i]);
            //System.out.println("L" + (i + 1) + (lockers[i]? " is open" : " is closed") + " (" + lockers[i] + ")");
            
            if (lockers[i] == true)
            {
                System.out.println("Locker " + (i + 1) + " is open");
            }
        }
    }
}
