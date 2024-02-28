import java.util.Arrays;

public class Shuffleing_Elements {
//    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//    Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//
//    Example 1:
//    Input: nums = [2,5,1,3,4,7], n = 3
//    Output: [2,3,5,4,1,7]
//    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
//

    static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int i = 0;
        int j = n;
        int curr = 0;
        while(i < n){
            res[curr] = nums[i];
            curr++;
            i++;

            res[curr] = nums[j];
            curr++;
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,6,2,4,5,6};
        int n = 4;
        int[] ans = shuffle(nums,n);
        System.out.println(Arrays.toString(ans));
    }
}

