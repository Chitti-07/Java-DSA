
/*This program contains the operations that can takes place in an array
    1.Adding the elements in an array
    2.Running sum of an array
    3.Maximum value of a sub array
    4.Shuffling elements in an array
    5.Maximum value of an array
    6.Elements that are greater than other elements in same array
    7.Sum of diagonal elements in an array
    8.Find the numbers with even no.of digits
    9.Transpose of a matrix
    10.Converting from one form to another form
    */


import java.util.Arrays;

public class Arrays_All_operations {

    public static void main(String[] args) {

        int[] arr = {2, 0, 1, 9};
        int[][] twoD = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] tar = {{1,1,1},{0,1,0},{0,0,0}};
//        int n = twoD.length;
//        int[][] ans = matrix(twoD, tar);
//        for (int[] nums: ans){
//            System.out.println(Arrays.toString(nums));
//        }

        System.out.println(matrix(twoD, tar));
//        int addition = add(arr);
//        System.out.println(addition);
//
//        int[] Running_sum = running_sum(arr);
//        System.out.println(Arrays.toString(Running_sum));
//
//        int Max_val = Max_val(twoD);
//        System.out.println(Max_val);
//
//        int[] array = {1, 1, 1, 1, 1, 7, 7, 7, 7, 7};
//        int[] Shuffle = Shuffle(array, 5);
//        System.out.println(Arrays.toString(Shuffle));
//
//        int[] exm = {1, 2, 4, 6, 7, 3, 34, 4, 668 ,34 ,35};
//        System.out.println(max(exm));
//
//        int[] arr2 = {1, 3, 5, 7, 3, 8, 9, 46, 68, 84, 6 };
//        System.out.println(Arrays.toString(greater_num(arr2)));


//        int[][] newArr = transpose(twoD);
//        for (int[] rows: newArr)
//            System.out.println(Arrays.toString(rows));

    }
    //1.Addition of elements in an array
    static int add(int[] arr){
        int sum = 0;//initial sum = 0
        //for every number in an array is added to sum variable
        for(int num: arr){
            sum += num;
        }
        return sum;
    }
//----------------------------------------------------------------------------------------------------------------------
    //2.Running sum
    static int[] running_sum(int[] arr){
        //it adds the previous element to current element--> [1,2,3,4,5] -> [1,3,6,10,15]
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }
//----------------------------------------------------------------------------------------------------------------------
    //3.Maximum value
    static int Max_val(int[][] arr){
        int max = 0;//initially the maximum is 0
        //every row in array
        for(int[] row: arr){
            int sum = 0;
            //every element in a row
            for (int num: row){
                sum += num;//sub array ele are added
            }
            //finding the max element in sub arrays--> [[1,2,3], [2,4,1]]-> 7(max value among two sub arrays)
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
//----------------------------------------------------------------------------------------------------------------------
    /*4.Shuffling the elements in array for a specified portion--> [1,2,3,4,5,6]->[1,4,2,5,3,6]
    *   here the value of portion is 3, where the array is divided to two parts
    *   the values in 1st part combaines with values of 2nd part, which ultimately shuffles the array*/

    static int[] Shuffle(int[] arr,int n){
        int[] ans = new int[arr.length];
        int i = 0;//1st part
        int j = n;//2nd part
        int current = 0;//curr ele

        while (i < n){
            //This adds the 1st part of ele to ans array
            ans[current] = arr[i];
            current++;
            i++;

            //This adds 2nd part of ele to ans array
            ans[current] = arr[j];
            current++;
            j++;
        }
        return ans;
    }
//----------------------------------------------------------------------------------------------------------------------
    //5.Max ele
    static int max(int[] arr){
        int max = 0;
        for (int num: arr){
            if (num >= max){
                max = num;
            }
        }
        return max;
    }
//----------------------------------------------------------------------------------------------------------------------
    //6.No.of max elements than other in same array
    static int[] greater_num (int[] arr){
        //New array that gives no.of greater elements
        int[] ans = new int[arr.length];
        //Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            //Iterate through same array 2nd time (to comp ele)
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j] && j != i){
                    count += 1;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
//----------------------------------------------------------------------------------------------------------------------
    //7.Sum of diagonal elements in an array
    static int sumofdiagonal(int[][] arr){
        //add diagonal elements--> for a 3x3 matrix arr[0][0]+arr[0][2]+arr[1][1]+arr[2][2]+arr[2][0]....
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i][i] + arr[i][len-i-1];
            //It adds the duplicate diagonal elements
        }

        //In order to eliminate the duplicate elements
        if (len % 2 == 1)//if the length is odd
            sum -= arr[len/2][len/2];//it eliminates the repeated duplicate element

        return sum;
    }
//----------------------------------------------------------------------------------------------------------------------
    //8.Find the numbers with even no.of digits
    static int evendigitsnum(int[] arr){
        int evenNumOfDigits = 0;
        for (int i = 0; i < arr.length; i++) {
            int digits = 0;
            while (arr[i] != 0){//it counts no.of digits of a number
                arr[i] /= 10;//Reduces a number digit by digit
                digits++;
            }
            if (digits % 2 == 0){//If the digit
                evenNumOfDigits++;
            }
        }
        return evenNumOfDigits;
    }
//----------------------------------------------------------------------------------------------------------------------
    //9.Transpose of a matrix
    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] new_mat = new int[cols][rows];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                new_mat[j][i] = matrix[i][j];
            }
        }
        return new_mat;
    }
//----------------------------------------------------------------------------------------------------------------------
    //10.Converting from one form to another form
    //This method is used to convert an array to integer-->[1, 2, 3] -> 123
    static int arrayForm(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res * 10 + arr[i];
        }
        return res;
    }

    //This method is used to convert an integer to Array--> 123 -> [1, 2, 3]
    static int[] intToArray(int num){
        int i = 0;
        int len = Integer.toString(num).length();
        int[] arr = new int[len];
        while (num != 0){
            arr[len-i-1] = num % 10;
            num /= 10;
            i++;
        }
        return arr;
    }
//----------------------------------------------------------------------------------------------------------------------
    static boolean matrix(int[][] arr, int[][] tar){
        int n = arr.length;

       // {{0,0,0},             {{1,1,1},
        // {0,1,0},              {0,1,0},
        // {1,1,1}}              {0,0,0}}

        for (int k = 0; k < 4; k++) {
            int[][] res = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    res[j][i] = arr[n - j - 1][i];
                }
            }
            if (equals(res, tar)){
                return true;
            }
            arr = res;
        }
        return false;
    }

    static boolean equals(int[][] a, int[][] b){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j])
                    return false;
            }
        }
        return true;
    }
}
