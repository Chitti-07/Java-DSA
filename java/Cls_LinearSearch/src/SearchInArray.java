import java.util.Arrays;

public class SearchInArray {
    public static void main(String[] args) {

        int[] nums = {1, 23, -1, 4, 676, 47, 86, 2, 67, 23, 23, 245, 35, 46};
        int ans = search(nums, 47);
        System.out.println(ans);

//        int [][] arr = {
//
//                {1, 2, 22},
//                {4, 6, 8},
//                {12, 45, 86}
//
//                };
//        int target = 22;
//        int[] ans = Num(arr,target); //to get the [_,_] as answer
//        System.out.println(Arrays.toString(ans));
    }
//-----------------------------------------------------------------------------------------------------------------------------

        //ONE DIMENTIONAL ARRAY

        //To return the element of index
//        static int search( int[] arr, int target){
//            //if the array length is 0, then return -1
//            if (arr.length == 0) {
//                return -1;
//            }
//
//            //iteration thorough the array to find the index of element
//            for (int element : arr) {
//                //finding whether the element is present or not
//                if (element == target) {
//                    return element;
//                }
//            }
//            return Integer.MAX_VALUE;
//        }
//-----------------------------------------------------------------------------------------------------------------------------
        //to return the index of the element
    static int search(int[] arr, int target){
//        //if the array length is 0, then return -1
        if(arr.length == 0){
            return -1;
        }
//        //iteration thorough the array to find the index of element
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            //finding whether the element is present or not
            if(element == target){
                return index;
            }
        }

        return Integer.MAX_VALUE;
        }


//-----------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------
        //MULTI_DIMENTIONAL ARRAY

//    static int[] Num(int[][] arr, int target) { //Format for 2D array
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col] == target) {
//                    return new int[]{row, col};
//                }
//            }
//        }
//        return new int[]{-1, -1};
//    }
}