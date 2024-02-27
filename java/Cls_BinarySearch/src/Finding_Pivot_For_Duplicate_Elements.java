public class Finding_Pivot_For_Duplicate_Elements {

    public static void main(String[] args) {
        int[] arr = {4,5,5,6,6,7,0,1,2};
        System.out.println(findPivotwithduplicates(arr));
//        int ans = Search(arr,6);
//        System.out.println(ans);
    }

    //to find the round count we can use the below function

    static int findrotationcount(int[] arr){
        int pivot = findPivotwithduplicates(arr);
        return pivot + 1;
    }

    //This method will not work for duplicate values
    
    static int Search(int[] arr, int target){
        int pivot = findPivotwithduplicates(arr);

        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length - 1);
        }

        if (arr[pivot] == target){
            return pivot;
        }

        if (target > arr[0]){
            return binarySearch(arr,target,0,pivot - 1);
        }
        return binarySearch(arr,target,pivot + 1,arr.length - 1);
    }



    static int binarySearch(int[]arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if (target > arr[mid]){
                start = end + 1;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }



    static int findPivotwithduplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            //if all start,mid,end are same then skip the elements
            if (arr[start] == arr[mid] && arr[end] == arr[mid]){
                //if the duplicate element is pivot then , check
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                if (arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            //we know that the left side is sorted
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
