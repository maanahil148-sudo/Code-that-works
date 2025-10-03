import java.util.Scanner;
public class TrafficLights {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
    String Color;
    System.out.println("Enter Any Traffic Light Colour");
    Color= Scanner.nextLine();
    Scanner.close();
    if (Color.equals("red")) {
        System.out.println("Stop");
        }
    else if(Color.equals("yellow")) {
         System.out.println("Slow Down");

     }
     else if(Color.equals("green")) {
         System.out.println("Go");

    }
    else{
          System.out.println("Invalid color. Please enter red, yellow, or green"); 
    }
    
}
}
