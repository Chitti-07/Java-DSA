public class OrderAgnosticBS {
    public static void main(String[]args){
        int[] arr = {112, 110, 100, 25, 23, 22, 19, 15, 10};
        int target = 110;
        int ans = OrAgBS(arr,target);
        System.out.println(ans);

    }

     static int OrAgBS(int[] arr, int target) {

         int start = 0;
         int end = arr.length - 1;

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