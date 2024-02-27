import java.util.Arrays;

class SumOf1DArray {

//    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//    Return the running sum of nums.
//
//    Example 1:
//    Input: nums = [1,2,3,4]
//    Output: [1,3,6,10]
//    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].


    static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }
}