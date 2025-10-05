import java.util.Scanner;
import java.util.Random;

public class Project3 {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        Random numberGenerator = new Random();

        int secretNumber = numberGenerator.nextInt(100) + 1;
        int playerGuess;

        System.out.println(" Select a number between 1 and 100.");

        do {
            System.out.print("Please enter your guess: ");
            playerGuess = inputReader.nextInt();

            if (playerGuess > secretNumber) {
                System.out.println("Your guess is too high. Try a smaller number.");
            } else if (playerGuess < secretNumber) {
                System.out.println("Your guess is too low. Try a larger number.");
            } else {
                System.out.println("Congratulations..... You've guessed correctly!");
                System.out.println("The secret number was  " + secretNumber + ".");
            }

        } while (playerGuess != secretNumber);

        inputReader.close();
    }
}