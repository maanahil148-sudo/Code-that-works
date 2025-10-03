import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       

        int secretNumber = scanner.nextIn( 100) + 1; // Generates number between 1 and 100
        int guess;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println(" Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

       
        while (guessedCorrectly) {
            System.out.print("Enter your guess: ");

          
            if (!scanner.hasNextInt()) {
                System.out.println(" Please enter a valid number.");
                scanner.next(); // Clear invalid input
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println(" Your guess must be between 1 and 100.");
            } else if (guess < secretNumber) {
                System.out.println(" Too low! Try a higher number.");
            } else if (guess > secretNumber) {
                System.out.println(" Too high! Try a lower number.");
            } else {
                System.out.println(" Congratulations! You guessed the number in " + attempts + " attempts.");
                guessedCorrectly = true;
            }
        }

        scanner.close();
    }
}

