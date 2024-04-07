/*
Given two n x n binary matrices mat and target,
return true if it is possible to make mat equal to target by rotating mat in 90-degree increments,
or false otherwise.

Example 1:
Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.

Example 2:
Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.

Example 3:
Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
 */


import java.util.Arrays;

public class RotationMatrix {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] tar = {{1,1,1},{0,1,0},{0,0,0}};
        boolean ans = findRotation(arr, tar);
        System.out.println(ans);
//        int[][] op = rotation(arr, tar);
//        for (int[] rows: op){
//            System.out.println(Arrays.toString(rows));
//        }
    }

    //To return true if the rotated array is equal to target array
    static boolean rotation(int[][] matrix, int[][] target){
        int n = matrix.length;//length of the matrix
        for (int k = 1; k < n; ++k) {//Rotate the matrix for length of the matrix(n)

            //Check if the matrix is equal to target at every rotation
            int[][] arr = new int[n][n];//creating a new array for rotation
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[j][n-i-1] = matrix[i][j];
                }
            }
            matrix = arr;
            if (IsEqual(matrix, target)){//Check whether it is equal or not
                return true;
            }
        }
        return false;
    }

    //Function to check if both matrix and target are equal or not
     static boolean IsEqual(int[][] matrix, int[][] target) {
        int n = matrix.length;
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 if (matrix[i][j] != target[i][j]){
                     return false;
                 }
             }
         }
         return true;
     }
//-----------------------------------------------------------------------------------------------------------
    static boolean findRotation(int[][] a, int[][] b) {

        int n=a.length;
        int c90=0,c180=0,c270=0,c0=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(b[i][j]==a[n-j-1][i])
                    c90++;
                if(b[i][j]==a[n-i-1][n-j-1])
                    c180++;
                if(b[i][j]==a[j][n-i-1])
                    c270++;
                if(b[i][j]==a[i][j])
                    c0++;
            }
        }

        if(c90==n*n||c270==n*n||c180==n*n||c0==n*n)
            return true;
        else return false;

    }
}
