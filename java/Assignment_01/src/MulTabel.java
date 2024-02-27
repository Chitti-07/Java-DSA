import java.util.Scanner;

public class MulTabel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number for multiplication table: ");
        int a = in.nextInt();
        System.out.print("Enter the no of steps of multiplication: ");
        int c = in.nextInt();
        int ans = 0;
        for (int b = 1; b <= c; b++) {
            ans = a * b;
            System.out.println(a + "x" + b +"=" +ans);

        }
    }
}
