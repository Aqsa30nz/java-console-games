import java.util.*;
public class GuessingGame
{
    public static void main (String args[])
    {
        Random rm =new Random();
        Scanner sc =new Scanner(System.in);

        int guess=0;
        int attempts=0;
        int randomnumber=rm.nextInt(1,101);

        System.out.println("lets play guessing the number game");
        System.out.println("**********************************");
        do
        {
            
             System.out.println("enter the guessed no in the range of 1 to 100");

            if (!sc.hasNextInt())
            {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue;  
            }

             guess = sc.nextInt();

            if (guess < 1 || guess > 100)
            {
                System.out.println("Please enter number between 1 and 100");
                continue;
            }

             attempts++;
             if (guess>randomnumber)
             {
                System.out.println("oooo no !!!!");
                System.out.println("your guess is too high");
                System.out.println("TRY AGAIN");
             }

             else if(guess<randomnumber)
             {
                System.out.println("ooo nooo!!!!!!");
                System.out.println("your guess is too low ");
                System.out.println("TRY AGAIN");
             }
        }
        while(guess!=randomnumber);

        System.out.println("CONGRATULATIONS !!!!!!!!");
        System.out.println("YOU HAVE WON THE GAME ");
        System.out.println("attempts ="+ attempts);

        sc.close();
    }
    
}
