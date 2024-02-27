import java.util.Arrays;

public class Create_Target_Array {

//    Given two arrays of integers nums and index.
//    Your task is to create target array under the following rules:
//    Initially target array is empty.
//    From left to right read nums[i] and index[i],
//    insert at index index[i] the value nums[i] in target array.
//    Repeat the previous step until there are no elements to read in nums and index.
//    Return the target array.
//    It is guaranteed that the insertion operations will be valid.
//
//    Example 1:
//    Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//    Output: [0,4,1,3,2]
//    Explanation:
//    nums       index     target
//        0            0        [0]
//        1            1        [0,1]
//        2            2        [0,1,2]
//        3            2        [0,1,3,2]
//        4            1        [0,4,1,3,2]

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        for(int i=0; i < index.length; i++){
            for(int j = i; j > index[i]; j--){
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }

    public static void main(String[] args) {
        int[] num = {0,1,2,3,4};
        int[] index = {0,1,2,3,1};
        int[] ans = createTargetArray(num,index);
        System.out.println(Arrays.toString(ans));
    }
}
