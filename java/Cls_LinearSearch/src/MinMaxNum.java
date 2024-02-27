public class MinMaxNum {
    public static void main(String[] args) {


        int arr[] = {12, 24, 35, 46, 78, 67};
//        int num = 86785;
//        int ans = min(arr,1,5);
//        System.out.println(ans);
//        System.out.println(String.valueOf(num).length());

//        int[][] arr = {
//                {12,34,6},
//                {65,34,0},
//                {12,89,90}
//        };
        int ans = Max(arr);
        System.out.println(ans);

    }
//-----------------------------------------------------------------------------------------------------------------------------
            //ONE DIMENTIONAL ARRAY
            //Minimum value

//    static int Min(int[] arr, int start, int end){
//        int min = arr[start];
//        for (int i = start; i <= end; i++) {
//            if (arr[i] < min){
//                min = arr[i];
//            }
//        }
//        return ans;
//    }

            //Maximum value

//    static int Max(int[] arr, int start, int end){
//        int max = arr[start];
//        for (int i = start; i <= end; i++) {
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }

    static int Max(int[] arr){
        int max = arr[0];
        for(int ele : arr){
            if(ele > max){
                max = ele;
            }
        }
        return max;
    }



//-----------------------------------------------------------------------------------------------------------------------------
            //TWO DIMWNTIONAL ARRAY
            //Minimum value


//    static int Min(int[][] arr){
//        int min = arr[0][0];
//        for (int[] row : arr){
//            for (int element : row){
//                if (element < min){
//                    min = element;
//                }
//            }
//        }
//        return min;
//    }

            //Maximum value
//            static int Max(int[][] arr){
//                int max = arr[0][0];
//                for (int[] row : arr){
//                    for (int element : row){
//                        if (element > max){
//                            max = element;
//                        }
//                    }
//                }
//                return max;
//            }
}
