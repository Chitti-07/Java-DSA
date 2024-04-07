import java.sql.SQLOutput;
import java.util.*;

class Array_To_ArrayForm_of_Integer {

    //Apprpach -> 1
    static int[] addToArrayForm(int[] num, int k) {
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            n = n * 10 + num[i];
        }
        int res = n + k;
        int j = 0;
        int len = Integer.toString(res).length();
        int[] arr = new int[len];
        while (n != 0) {
            arr[len - j - 1] = n % 10;
            n = n / 10;
            j++;
        }
        return arr;
    }

    //Approach -> 2
    static int[] addToArray(int[] arr, int k){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        int res = num + k;
        int len = Integer.toString(res).length();
        int[] newArr = new int[len];
        int j = 0;
        while (res != 0){
            newArr[len-j-1] = res % 10;
            res /= 10;
            j++;
        }
        return newArr;
    }



    public static void main(String[] args) {
        int[] num = {5, 7, 3};
        int k = 781;
        System.out.println(Arrays.toString(addToArray(num,k)));
    }
}