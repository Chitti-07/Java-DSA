import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNums {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = sort(arr);
        System.out.println(ans);
    }

    static List<Integer> sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int corrInd = arr[i] - 1;
            if (arr[i] != arr[corrInd]){
                swap(arr, i, corrInd);
            }else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
