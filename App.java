import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int attempt = 5;
        int tries = 0;
        int randomNumber = rand.nextInt(100) + 1;
        
        System.out.println("You have to guess a number ");

        while(attempt != 0){
            System.out.println("Enter Your Guess(1-100) : ");
            int playerGuess = sc.nextInt();
            tries++;
            
            if (playerGuess == randomNumber){
                System.out.println("Wow Babe! You Guessed it Right");
                System.out.println("You did it in only " + tries + " tries");
                break;
            }
            else if (playerGuess < randomNumber){
                System.out.println("Nope! The number is Higher. Guess again.");
            }
            else{
                System.out.println("Nope! The number is Lower. Guess again.");
            }
            attempt--;
        }
        if(attempt == 0){
            System.out.println("Sorry, you ran out of the tries");
            System.out.println("the correct no. is " + randomNumber);
        }
        sc.close();
    }
}