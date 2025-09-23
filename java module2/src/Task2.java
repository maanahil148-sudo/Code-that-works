import java.util.Scanner;
public class Task2 {
public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    String Username;
    System.out.println("Enter Your Username");
   Username= Scanner.nextLine();

    String Password;
    System.out.println("Enter Your Password");
   Password= Scanner.nextLine();
   Scanner.close();
   if(Username.equals("Admin")  &&  Password.equals("Admin123")){
    System.out.println("Login Successfully");
   }
   else{
    System.out.println("Invalid Credentials. Please try again.\"");
   }

}

    
}
