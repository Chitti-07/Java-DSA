import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;

public class ReversingEle {
    public static void main(String[] args) {

//        int num = 123456789;
//        int ans = reversenum(num);
//        System.out.println(ans);


        int[] nums = {1, 2, 3, 45, 5};
//        System.out.println(nums.length);
//        swap(nums,0,4);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(max(nums, 0, 1));
        reverse(nums);
        System.out.println(Arrays.toString(nums));

    }

//-----------------------------------------------------------------------------------------------------------------------------------------------

    //For getting the max value from the whole array
//    static int max(int[] arr, int start, int end) {
//        int maxval = start;
//        for (int i = 0; i <= end; i++) {
//            if (arr[i] > maxval){
//                maxval = arr[i];
//            }
//        }return maxval;
//    }

//-----------------------------------------------------------------------------------------------------------------------------------------------

    //For swapping the selected numbers
    static void swap(int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

//-----------------------------------------------------------------------------------------------------------------------------------------------

    //For reversing the arrayList
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            swap(arr,start,end);
            start++;
            end--;

        }

    }

//-----------------------------------------------------------------------------------------------------------------------------------------------
  //to reverse the number using function
//    static int reversenum(int num){
//        int ans = 0;
//        while (num != 0){
//            int rem = num % 10;
//            ans = ans * 10 + rem;
//            num /= 10;
//        }
//        return ans;
//    }
}