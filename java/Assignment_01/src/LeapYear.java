import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("Enter the year(0 to exit): ");
            int a = in.nextInt();
            if (a == 0){
                System.out.print("Operation exited");
                break;
            } else if (a % 400 == 0) {
                System.out.println("It is a leap year");
            }else {
                System.out.println("It is not a leap year");
            }
        }
    }
}
