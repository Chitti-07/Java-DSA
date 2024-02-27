import java.util.Arrays;

public class Build_Array_from_Permutation {


//    Given a zero-based permutation numbs(0-indexed),
//    build an array ans of the same length
//    where ans[i] = numbs[numbs[i]] for each 0 <= i < numbs.length and return it.
//
//    A zero-based permutation numbs is an array of distinct integers
//    from 0 to numbs.length - 1 (inclusive).
//
//    Example 1:
//    Input: numbs = [0,2,1,5,3,4]
//    Output: [0,1,2,4,5,3]
//    Explanation: The array ans is built as follows:
//    ans = [numbs[numbs[0]], numbs[numbs[1]], numbs[numbs[2]], numbs[numbs[3]],
//    numbs[numbs[4]], numbs[numbs[5]]]
//            = [numbs[0], numbs[2], numbs[1], numbs[5], numbs[3], numbs[4]]
//            = [0,1,2,4,5,3]

    static int[] buildAnArray(int[] nums){
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,5,3,4};
        int[] ans = buildAnArray(arr);
        System.out.println(Arrays.toString(ans));
    }







}
