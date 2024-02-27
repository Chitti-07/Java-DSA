import java.util.Arrays;

public class SetMissMatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                //element at current index is not equal to ele at correct ind
                swap(arr,i,correct);
                //swap the ele
            }else {
                i++;
                //the element greater than size is skipped to last index
            }
        }
        //Finally we get a sorted array
        for (int index = 0; index < arr.length; index++) {
            //Check whether the ele and ind are equal
            if (arr[index] != index + 1){
                //returning the missing ele
                return new int[]{arr[index], index + 1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
