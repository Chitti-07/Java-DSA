import java.util.Arrays;

public class Bubble_Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble_sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_sorting(int[] arr){
        //running N-1 steps
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                //comparing whether the adjacent ele is smaller or not
                if (arr[j] < arr[j-1]){
                    //if it is smaller, then swap the numbers
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    //confirm that the array is already swapped
                    swapped = true;
                }
            }
            //if the array is already swapped, then the above array breaks
            if (!swapped){
                break;
            }
        }
    }
}
