import java.util.Random;
import java.util.Scanner;

public class GuessingGame{
    public static void main(String[] args){

        System.out.println("I’m thinking of a number between 1 and 100. Can you guess it?");
        
        Random pick = new Random();
        int t = pick.nextInt(100) + 1;

        int numberOfTrials = 1;

        while (true){
            Scanner enter = new Scanner(System.in);
            int guess = enter.nextInt();

            if (guess != t){
                if (guess < t){
                    System.out.println("Good try, but that’s too low. Try again.");
                }
                else if (guess > t){
                    System.out.println("Good try, but that’s too high. Try again.");
                }
                numberOfTrials += 1;
            }

            else{
                System.out.println("Yes! You guessed correctly after " + numberOfTrials + " tries! Congratulations.");
            }
        }
    }
}