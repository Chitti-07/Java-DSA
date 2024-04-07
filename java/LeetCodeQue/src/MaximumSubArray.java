/*
Given an integer array nums, find the
subarray with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

 */


public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(maxsum(arr));
    }
    static int subarray(int[] arr){//--> Approach - 1
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > max) max = sum;
            if (sum < 0) sum = 0;

        }
        return max;
    }
    static int maxsum(int[] nums){
        int max = nums[0];
        int curr_max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr_max = Math.max(nums[i], nums[i]+curr_max);
            max = Math.max(curr_max, max);
        }
        return max;
    }
}
