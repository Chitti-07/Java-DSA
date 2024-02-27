import java.util.Arrays;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int[][] op = transpose(arr);
        for(int[] rows : op){
            System.out.println(Arrays.toString(rows));
        }
    }
    static int[][] transpose(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        
        int[][] new_mat = new int [cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                new_mat[j][i] = arr[i][j];
            }
        }
        return new_mat;
    }
}
