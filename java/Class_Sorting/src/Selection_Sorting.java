import java.util.Arrays;

public class Selection_Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        //iterating through the array for n-1 times
        for (int i = 0; i < arr.length; i++) {
            //last position index
            int lastInd = arr.length - i - 1; // (last = n-i-1)
            //max value index
            int maxInd = getMax(arr, 0, lastInd);// Getting the max value
            //Now we have to swap the max value index to last index
            swap(arr, maxInd, lastInd);
        }
    }

    static int getMax(int[] arr, int start, int end){
        int max = 0;
        for (int i = start; i <= end ; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
