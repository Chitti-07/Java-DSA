import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean res = isprime(n);
        System.out.println(res);


    }
    static boolean isprime(int a){
        if (a <= 1){
            System.out.println("neither prime nor composite");
            return false;
        }
        int c = 2;
        while (c < a){
            if (a % c == 0){
                return false;
            }
            c ++;
        }
        return true;

    }

}
