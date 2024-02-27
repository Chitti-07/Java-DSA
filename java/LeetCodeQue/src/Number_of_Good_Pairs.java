public class Number_of_Good_Pairs {

//        Given an array of integers nums, return the number of good pairs.
//        A pair (i, j) is called good if nums[i] == nums[j] and i < j.
//                Example 1:
//        Input: nums = [1,2,3,1,1,3]
//        Output: 4
//        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (i<j && nums[i] == nums[j]){
                     count += 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        int ans = numIdenticalPairs(arr);
        System.out.println(ans);
    }
}
