/*
You are given a large integer represented as an integer array digits,
where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

 */

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        System.out.println(Arrays.toString(arr(arr)));
    }

    static int[] arr(int[] nums) {
        int len = nums.length;
        for (int i = len-1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int[] new_arr = new int[len+1];
        new_arr[0] = 1;
        return new_arr;
    }
}
