import java.util.Arrays;

public class Two_Sum {

//    Given an array of integers nums and an integer target,
//    return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution,
//    and you may not use the same element twice.
//    You can return the answer in any order.
//    Example 1:
//
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
//

    static int[] twoSum(int[] nums, int target) {
//        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,7,8};
        int target = 8;
        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
