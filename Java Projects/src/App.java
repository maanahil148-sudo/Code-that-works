import java.util.Scanner;
public class App {
 public static void main(String[] args) {
        int randomNumber;
        int guess;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);
        randomNumber = scanner.nextInt(100) + 1; // random number between 1 and 100

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
           if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}

     
