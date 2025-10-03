import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
         int n;
         int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        n = scanner.nextInt();

        double average;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}
