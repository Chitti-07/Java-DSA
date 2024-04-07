/*
You are given an m x n matrix mat and two integers r and c
representing the number of rows and the number of columns of the wanted reshaped matrix.
The reshaped matrix should be filled with all the elements of the original matrix
in the same row-traversing order as they were.
If the reshape operation with given parameters is possible and legal,
output the new reshaped matrix; Otherwise, output the original matrix.

Example 1:
Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

Example 2:
Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
 */


import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        int[][] ans = matrixRes(arr, 1, 4);
        for (int[] rows: ans) {
            System.out.println(Arrays.toString(rows));
        }

    }
    //Approach -> 1
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;

        if (rows * cols != r * c) return mat;

        int[][] ans_arr = new int[r][c];
        int row_num = 0;
        int col_num = 0;

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                ans_arr[row_num][col_num] = mat[i][j];
                col_num++;
                if (col_num == c) {
                    col_num = 0;
                    row_num++;
                }

            }
        }
        return ans_arr;
    }

    //Approacj -> 2
    static int[][] matrixRes(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r*c) return mat;
        else if (mat.length == r || mat[0].length == c) return mat;

        int row = 0, col = 0;
        int[][] ans = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
               if (col < c) {
                   ans[row][col++] = mat[i][j];
               }
               else {
                   col = 0;
                   row++;
                   ans[row][col++] = mat[i][j];
               }
            }
        }
        return ans;
    }
}
