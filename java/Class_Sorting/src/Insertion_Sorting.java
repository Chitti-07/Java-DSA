import java.util.Arrays;

public class Insertion_Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertion_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion_Sort(int[] arr){
        //running the outer loop for (>=n-2) or (>n-2) times
        for (int i = 0; i < arr.length - 1; i++) {
            //running the inner loop to swap the elements
            for (int j = i+1; j > 0 ; j--) {
                //comparing the adjacent elements
                if (arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                }
                else {
                    break;
                }
            }
        }
    }

    //Swapping the elements 
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
