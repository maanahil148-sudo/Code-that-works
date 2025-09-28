import java.util.Scanner;

public class SwitchStatement {
    
    public static void main(String[] args) {
        int day;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number(1-3)");
        day=scanner.nextInt();
      scanner.close();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
             case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;   
        
            default:
            System.out.println("Invalis day");
                
        }
    }
}
