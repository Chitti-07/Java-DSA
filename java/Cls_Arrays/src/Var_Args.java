import java.util.Arrays;

public class Var_Args {
    public static void main(String[] args) {
        sig(1,234,45,23,56,23,45,67,78,23); //we can give so many numbers as input
        multiple(1,3,4,56,67,66,45,34,343);

    }
    static void multiple(int a, int b, int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void sig(int ...v) //it is called the variable length arguments, which can take so many numbers as input
    {
        System.out.println(Arrays.toString(v));
    }
}
