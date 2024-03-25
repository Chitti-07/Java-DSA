/*Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

        A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.



        Example 1:

        Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
        Output: [15]
        Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
        Example 2:

        Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
        Output: [12]
        Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNum {
    public static void main(String[] args) {
        int[][] arr = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        System.out.println((luckyNumbers(arr)));
    }

    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int midInd = 0;
            int min = 99999999;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                    midInd = j;
                }
            }
            boolean istrue = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][midInd] < matrix[j][midInd]){
                    istrue = false;
                    break;
                }
            }
            if (istrue){
                arr.add(matrix[i][midInd]);
            }
        }
        return arr;
    }
}
