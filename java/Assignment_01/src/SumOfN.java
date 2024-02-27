import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int ans = sumofN(a);
        System.out.println(ans);
    }

    static int sumofN(int a){
        int n = a;
        return (n * (n+1)) / 2;
    }
}
