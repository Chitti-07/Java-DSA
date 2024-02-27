import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int ans = facto(n);
//        System.out.println(ans);
        int ans = fact(n);
        System.out.println(ans);
    }

    //Factorial by using the func.
//    static int facto(int num){
//        if (num == 0){
//            return 1;
//        }
//        return (num * facto(num - 1));
//    }

    //Factorial by using looping func.

    static int fact(int num){
        int mul = 1;
//        for (int i = num; i > 0; i--)
        for (int i = 1; i <= num; i++)
        {
            mul *= i;
        }
        return mul;
    }



}
