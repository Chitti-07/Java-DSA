import java.util.Arrays;
import java.util.Scanner;

public class Array_Cls {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        //ONE DIMENTIONAL ARRAY


//        int arr[] = new int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //we can replace the above for loop with enhanced for loop to print the numbers
//        for(int num : arr){  //-> for every element in array print element
//            System.out.print(num + " ");  //-> num is the element of array
//        }

        //here we can totally overcome the above for loop by using the below statement
        // System.out.println(Arrays.toString(arr));


        //For String opt


//        String[] str = new String[3];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = in.next();
//        }
//        System.out.println(Arrays.toString(str));



        //MULTI-DIMENTIONAL ARRAYS



//        int[][] arr =new int[3][3];
//
//        //for each row in array
//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) { //for every col it takes that row length
//                arr[row][col] = in.nextInt();
//            }
//        }
 
//        //To print the matrix
//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) { //for every col it takes that row length
//                System.out.print(arr[row][col] + " ");
//            }
//            //to print it in a form of matrix we have to print a new line for each row
//            System.out.println();
//        }



//        we can also print this by using enhanced for loop
//        for(int[] row : arr) { // In array each element is itself an array [ [],[],[] ](array of arrays)
//            for (int col : row) { // In each element of array is an integer [_,_,_,](elements in an array)
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }


        //we can print this by using Arrays.toString method
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }


        //we can also print this by using Arrays.toString method with the help of enhanced for loop
//        for(int[] num : arr){
//            System.out.print(Arrays.toString(num));
//            System.out.println();
//        }

        //For String

        String str[][] = new String[3][3];

        for (int row = 0; row < str.length; row++) { //for every row it contains array itself
            for (int col = 0; col < str[row].length; col++) { //for each col
                str[row][col] = in.next();
                System.out.print(str[row][col] + " ");

            }

        }


        //printing the elements

//        for (int row = 0; row < str.length; row++) {
//            for (int col = 0; col < str[row].length; col++) {
//                System.out.print(str[row][col] + " ");
//            }
//            System.out.println();
//        }

        //printing using Arrays.toString method

//        for (int row = 0; row < str.length; row++) {
//            System.out.println(Arrays.toString(str[row]));
//        }






        //printing elements using enhanced for loop

//        for(String[] row : str){
//            System.out.print(Arrays.toString(row));
//            System.out.println();
//        }


    }

}
