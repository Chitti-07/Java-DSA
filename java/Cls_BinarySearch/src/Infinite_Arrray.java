public class Infinite_Arrray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 3;
        int ans = ans(arr,target);
        System.out.println(ans);
    }

    //we have to find the target without knowing the length of an array

    static int ans(int[] arr, int target){

        int start = 0;//Here we assume that the 1st ele is start
         int end = 1;//and the 2nd ele is end

        //we have to double the length b/w start & end, if the target is > end

        while(target > arr[end]){//if the target is > end, iterate the ele

            //Creating new start and end

            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;

        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

         while(start <= end){
             int mid = start + (end - start)/2;

             if (target > arr[mid]){
                 start = mid + 1;
             }else if (target < arr[mid]){
                 end = mid - 1;
             }else{
                 return mid;
             }
        }
         return -1;
    }
}
