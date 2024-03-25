
/*Given an integer n, return any array containing n unique integers such that they add up to 0.



        Example 1:

        Input: n = 5
        Output: [-7,-1,1,3,4]
        Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
        Example 2:

        Input: n = 3
        Output: [-1,0,1]
        Example 3:

        Input: n = 1
        Output: [0] */


import java.util.Arrays;

public class UniqueIntegerSum {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(Arrays.toString(UniSum(n)));

    }
    static int[] UniSum(int n){
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = i * 2 - n + 1;
        }
        return arr;
    }
}
