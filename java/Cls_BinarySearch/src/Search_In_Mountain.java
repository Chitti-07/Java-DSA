public class Search_In_Mountain{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int ans = search(arr,3);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        int peak = peak(arr);
        int firstTry = binarySearch(arr,target,0,peak);
        if (firstTry != -1){
            return firstTry;
        }
        return binarySearch(arr,target,peak + 1 ,arr.length - 1);

    }
    //To search the peak element in an array
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

    //To search the element in an array
    //For Ascnd and Descnd we use order Agnostic

    static int binarySearch(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            //To get the mid point
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            //if our target is <, >, =, then

        }
        return -1;
    }
}
