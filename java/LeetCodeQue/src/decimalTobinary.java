import java.sql.SQLOutput;

public class decimalTobinary {
    public static void main(String[] args) {
        binary(10);
    }
    static void binary(int num){
        int i = 0;
        int[] arr = new int[100];
        while (num > 0){
            arr[i] = num % 2;
            num /= 2;
            i++;
        }
        for (int j = i-1; j >= 0 ; j--) {
            System.out.print(arr[j]);
        }
    }

}
