import java.util.Arrays;
//given that the array is from [0 to n]
//here we take the correct index as arr[i]

public class MissingNum {
    public static void main(String[] args) {

        int[] arr = {4, 0, 1, 2};
        System.out.println(sort(arr));
    }
//By using this we can get a sorted array
    static int sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
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
            if (arr[index] != index){
                //returning the missing ele
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
