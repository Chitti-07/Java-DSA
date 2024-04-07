import java.util.Arrays;
import java.util.Scanner;

//    1252. Cells with Odd Values in a Matrix
//    Hint
//    There is an m x n matrix that is initialized to all 0's.
//    There is also a 2D array indices where each indices[i] = [ri, ci] represents
//    a 0-indexed location to perform some increment operations on the matrix.
//    For each location indices[i], do both of the following:
//    Increment all the cells on row ri.
//    Increment all the cells on column ci.
//    Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
//
//    Example 1:
//    Input: m = 2, n = 3, indices = [[0,1],[1,1]]
//    Output: 6
//    Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//    After applying first increment it becomes [[1,2,1],[0,1,0]].
//    The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.

    class Solution {
        public int oddCells(int m, int n, int[][] indices) {
            int[][] mat = new int[m][n];
            for(int[] arr : indices){
                int r = arr[0];
                int c = arr[1];

                for(int col = 0; col < n; col++){
                    mat[r][col] += 1;
                }
                for(int row = 0; row < m; row++){
                    mat[row][c] += 1;
                }
            }

            int count = 0;
            for(int row = 0; row < mat.length; row++){
                for(int col = 0; col < mat[row].length; col++){
                    if(mat[row][col] % 2 != 0){
                        count++;
                    }
                }
            }
            return count;
        }
    }

