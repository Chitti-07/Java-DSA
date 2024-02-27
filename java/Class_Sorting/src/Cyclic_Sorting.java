import java.util.Arrays;

public class Cyclic_Sorting {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr){
        int i = 0;
        while(i < arr.length){
            int correct_ind = arr[i] - 1;
            if (arr[i] != arr[correct_ind]){
                swap(arr,i,correct_ind);
            }else {
                i++;
            }
        }
    }

    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
