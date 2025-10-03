import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
       int number ;
      System.out.print("Enter Any number");
      number=Scanner.nextInt();
      Scanner.close();
      if(number%2==0){
        System.out.println(number+   "is an even number");

      }
      else{
        System.out.println(number+   "is an odd number");
      }
    }
}