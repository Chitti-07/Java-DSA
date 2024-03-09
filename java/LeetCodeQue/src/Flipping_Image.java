import java.util.Arrays;

public class Flipping_Image {

    //    832. Flipping an Image
//
//    Given an n x n binary matrix image,
//    flip the image horizontally, then invert it, and return the resulting image.
//    To flip an image horizontally means that each row of the image is reversed.
//    For example, flipping [1,1,0] horizontally results in [0,1,1].
//    To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//    For example, inverting [0,1,1] results in [1,0,0].
//
//    Example 1:
//    Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//    Output: [[1,0,0],[0,1,0],[1,1,1]]
//    Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//    Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]


    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        flip(arr);
        for (int[] rows: arr){
            System.out.println(Arrays.toString(rows));
        }


    }


    //1st type of approach

//    static int[][] flipAndInvertImage(int[][] A) {
//        for (int i = 0; i < A.length; i++) {
//            int s = 0;
//            int e = A.length - 1;
//
//            while(s <= e){
//                if (A[i][s] == A[i][e]){
//                    A[i][s] = 1 - A[i][s];
//                    A[i][e] = A[i][s];
//                }
//                s++;
//                e--;
//            }
//        }
//        return A;
//
//    }

    //2nd type of apprach

//    static int[][] InvertImage (int[][] arr){
//        for(int[] row : arr){
//            reverse(row);
//            flip(row);
//        }
//        return arr;
//    }
//
//    static int[][] reverse(int[] arr){
//        int start = 0;
//        int end = arr.length - 1;
//
//        while(start <= end){
//            int temp = arr[start];
//            arr[start++] = arr[end];
//            arr[end--] = temp;
//        }
//        return arr;
//    }
//
//    static void flip(int[] arr){
//        for (int num: arr){
//            num = num == 0 ? 1 : 0;
//        }
//
//    }

    static int[][] flip(int[][] arr){
        for (int[] rows: arr){
            int start = 0;
            int end = rows.length - 1;

            while (start <= end){
                int temp = rows[start];
                rows[start++] = rows[end] ^ 1;
                rows[end--] = temp ^ 1;


            }
//            for (int num: rows){
//                if (num == 0){
//                    num ^= 1;
//                }
//            }
        }
        return arr;
    }
}
