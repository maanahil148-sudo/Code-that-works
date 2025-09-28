import java.util.Scanner;
public class project2 {
       public static void main(String[] args) {
       double num1;
       double num2;
       char oprt;
         double result;
        Scanner scanner = new Scanner(System.in);
          System.out.println("Enter a number");
          num1=scanner.nextDouble();
            System.out.println("Enter a number");
            num2=scanner.nextDouble();
              System.out.println("Enter any operator");
             oprt = scanner.next().charAt(0);
             
             switch (oprt) {
                 case'+':
                 result= num1+num2;
                 System.out.println("");
                 break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;

            default:
            System.out.println("Invalid operation.");
            scanner.close();
        }
    }

       }
    