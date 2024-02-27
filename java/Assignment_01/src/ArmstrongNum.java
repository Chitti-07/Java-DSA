import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = in.nextInt();

        for (int i = 2; i < n; i++) {
            if (isarmstrong(i)){
                System.out.print(i+ " ");
            }
        }


    }
    static boolean isarmstrong(int n){
        int org = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            n /= 10;
            sum = sum + rem*rem*rem;
        }
        return sum == org;
    }
}
