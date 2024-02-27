public class Flooring_Method {

    //Here we have to return the greatest number which is <= target
    //we use same approach of binary search and implement it

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9,10};
        int target = 11;
        int ans = Ceiling(arr,target);
        System.out.println(ans);
    }

    static int Ceiling(int[] arr, int target){

        if (target < arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return end; //it returns the greatest number <= target
                    //Here the condition is voilated by Start > End
    }
}
