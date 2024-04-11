/*
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

Example 1:
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]

Example 2:
Input: n = 1
Output: [[1]]
 */

import java.util.Arrays;

public class Spiral_Matrix_II {
    public static void main(String[] args) {
        int n = 3;
        int[][] ans = spiral(n);
        for (int[] arr: ans) {
            System.out.println(Arrays.toString(arr));
        }
    }
    static int[][] spiral(int n) {

        int top = 0,bottom = n-1;
        int left = 0,right = n-1;

        int[][] arr = new int[n][n];
        int value = 1;

        while (top<=bottom && left<=right) {

            for (int i=left; i<=right; i++) arr[top][i] = value++;

            for (int i=right; i<=bottom; i++) arr[i][right] = value++;

//            for (int i=right; i>=left; i--) {
//                arr[bottom][i] = value++;
//            }
//            bottom--;

            if (top < bottom && left < right) {
                for (int i=right; i>=left; i--) arr[bottom][i] = value++;

                for (int i=bottom; i>=top; i--) arr[i][left] = value++;
            }
            top++;
            right--;
            bottom--;
            left++;


//            for (int i=bottom; i>=top; i--) {
//                arr[i][left] = value++;
//            }
//            left++;


        }
        return arr;
    }
}
