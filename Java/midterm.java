import java.util.Scanner;

public class midterm
{
    public static void main (String[] args)
    {
        //array of strings
        String[] move = {"Rock", "Paper", "Scissor"};

        //score trackers
        int playerWins = 0;
        int cpuWins = 0;

        //player's move
        int player;

        //start scanner outside the loop
        Scanner input = new Scanner(System.in);

        //game loop
        while(true)
        {
            //computer's move
            int cpu = (int)(Math.random()*3);

            //loop displays rules and determines valid player input
            while(true)
            {        
                System.out.print(move[0] + " (0), " + move[1] +" (1), " + move[2] + " (2): ");
                player = input.nextInt();

                if(player == 0 || player == 1 || player == 2)
                {
                    break;
                }
                else
                    System.out.println("Invalid Input!");
            }

            //display computer move
            System.out.print("The computer is ");
            switch(cpu)
            {
                case 0: 
                System.out.print(move[0] + ".");
                break;

                case 1:
                System.out.print(move[1] + ".");
                break;

                case 2:
                System.out.print(move[2] + ".");
            }

            //display player move
            System.out.print(" You are ");
            switch(player)
            {
                case 0:
                System.out.print(move[0]);
                break;

                case 1:
                System.out.print(move[1]);
                break;

                case 2:
                System.out.print(move[2]);
            }

            //if there is a draw
            if (cpu == player)
                System.out.println(" too. It is a draw!");
            else
            {
                //sets win as true if player wins
                boolean win = (player == 0 && cpu == 2) ||
                    (player == 1 && cpu == 0) ||
                    (player == 2 && cpu == 1);
               //if win is true
                if (win)
                {
                    playerWins++;
                    System.out.println(". You won! You " + playerWins + " : " + cpuWins + " computer");
                }
                //if win is false
                else
                {
                cpuWins++;

                    System.out.println(". You lost... You " + playerWins + " : " + cpuWins + " computer");
                }
            }

            //play again option
            System.out.println("Play again? (Yes = 10, No = -1)");
            int playAgain = input.nextInt();
            if(playAgain == -1)
            {
                break;
            }
            else if (playAgain == 10)
            {
                continue;
            }
            else
            {
                System.out.println("Invalid input!");
            }
        
        }

        //close scanner
        input.close();
    }
}