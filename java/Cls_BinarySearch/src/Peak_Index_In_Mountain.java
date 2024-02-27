public class Peak_Index_In_Mountain{

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,7,6};
        int peak = peak(arr);
        System.out.println(peak);
    }

    static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
//    static int binarySearch(int[] arr, int target){
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end){
//            int mid = end + (end - start + 1) * 2;
//
//            if (target > arr[mid]){
//                start = mid + 1;
//            }else if (target < arr[mid]){
//                end = mid - 1;
//            }else {
//                return mid;
//            }
//        }
//        return -1;
//    }
}
