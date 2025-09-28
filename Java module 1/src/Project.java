import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
       double billamount;
      System.out.print("Enter your bill");
       billamount = Scanner.nextDouble();
       double tipPercentage;
       System.out.println("Enter Tip Amount");
       tipPercentage = Scanner.nextDouble();
        Scanner.close();
       
      double tipAmount = billamount * (tipPercentage/ 100);
       double totalamount = tipAmount + billamount;
        System.out.println("Tip Amount Is:"  +tipAmount);
        System.out.println("Total Amount is:"  +totalamount);


    }
    
}