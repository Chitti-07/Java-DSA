import java.sql.SQLOutput;
import java.util.*;

class Array_To_ArrayForm_of_Integer {
    static int[] addToArrayForm(int[] num, int k) {
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            n = n * 10 + num[i];
        }
        n = n + k;
        int j = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while (n != 0) {
            arr[len - j - 1] = n % 10;
            n = n / 10;
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] num = {2, 7, 4};
        int k = 181;
        System.out.println(Arrays.toString(addToArrayForm(num,k)));
    }
}