import java.util.Arrays;

public class Sorted_Matrix_Search {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9} };
        int target = 11;
        System.out.println(Arrays.toString(search(matrix,target)));
    }

    //Simple Binary Search in a single row, this can be used in matrix
    static int[] binarySearch(int[][] arr,int row,int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            //Cases
            //if target = element
            if (target == arr[row][mid]){
                return new int[]{row,mid};
            }
            //if target > mid
            if (target > arr[row][mid]){
                cStart = mid + 1;
            }
            //if target < mid
            else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

    //Searching in matrix untill the matrix becomes two rows
    static int[] search(int[][] arr, int target){
        //taking full matrix
        int rows = arr.length;
        int cols = arr[0].length;

        //if only one row is present
        if (rows == 1){
            return binarySearch(arr,0,0,cols - 1,target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < rEnd - 1){
            int mid = rStart + (rEnd - rStart) / 2;

            //cases
            //if element == target
            if (arr[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            //if target > element
            if (target > arr[mid][cMid]){
                rStart = mid;
            }
            //if target < element
            else {
                rEnd = mid;
            }

        }
        //Now we have 2 rows
        //check whether the target is in middle columns or not

        //if target is in 1st row
        if (arr[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        //if the target is in 2nd row
        if (arr[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }

        //searching in the four stages/corners
        //searching in 1st corner
        if (target <= arr[rStart][cMid - 1]){
            return binarySearch(arr,rStart,0,cMid-1, target);
        }
        //searching in 2nd corner
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]){
            return binarySearch(arr,rStart,cMid + 1, cols - 1, target);
        }
        //searching in 3rd corner
        if (target <= arr[rStart+1][cMid]-1){
            return binarySearch(arr,rStart+1,0,cMid-1, target);
        }
        //searching in 4th corner
        else {
            return binarySearch(arr,rStart+1,cMid+1, cols-1, target);
        }

    }
}
