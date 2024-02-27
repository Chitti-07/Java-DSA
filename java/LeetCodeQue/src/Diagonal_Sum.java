public class Diagonal_Sum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = diagonalSum(arr);
        System.out.println(sum);
    }

    static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0;i < n; i++) {
            sum += mat[i][i] + mat[i][n - i - 1];
        }
        if (n % 2 == 1){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }

}
