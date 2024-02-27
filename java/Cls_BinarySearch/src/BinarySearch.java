public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12, -10, 0, 12, 23, 34, 45, 56, 67};
        int target = 45;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);

    }
    static int BinarySearch(int[] arr, int target){
        //let us consider the start and end points of an array
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //To get the mid point
            int mid = start + (end - start) / 2;

            //if our target is <, >, =, then
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
