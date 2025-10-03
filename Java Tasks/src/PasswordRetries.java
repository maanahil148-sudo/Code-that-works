import java.util.Scanner;
public class PasswordRetries {
    public static void main(String[] args) {
       String correctPassword = "secret123";
        String enteredPassword;
        int attempts=3;

        Scanner scanner= new Scanner(System.in);

        while(attempts>0){
             attempts--;
            System.out.print("Enter the password:");
            enteredPassword = scanner.nextLine();

            if(enteredPassword.equals(correctPassword)){
                System.out.println("Login Successful!");
                break;
            }
            else{
                if (attempts > 0) {
                    System.out.println("Incorrect Password. You have " + attempts + " attempts left.");
                } else {
                    System.out.println("Account Blocked. Please Contact support.");  
                }
            }
        }
        scanner.close();
    }
        
}
    

