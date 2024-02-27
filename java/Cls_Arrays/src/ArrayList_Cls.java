import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList_Cls{
    public static void main(String[] args) {

        //Single Dimentional ArrayList

        //Declaration
        //ArrayList<Integer> list = new ArrayList<>(10);
        //Integer = raper type , ArrayList is a constructor that stores the values
        //the capacity is not mandatory
        Scanner in = new Scanner(System.in);

        //by using the below structure we can only print one element
//        list.add(in.nextInt());
//        System.out.println(list);

        //By using below structure we can print the defined values
//        list.add(123);
//        list.add(12);
//        list.add(354);
//        list.add(5412);
//        list.add(45);
//        System.out.println(list);

        //By using the below structure we can print the series given by user
//        for (int i = 0; i < 5; i++) { //we have to take i/p from user by each step , for this we are using the loops
//            list.add(in.nextInt()); //for each step it takes the i/p from user
//            System.out.print(list.get(i) + " ");
//        }

        //Multi-dimentional ArrayList

        //Declaration
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);

        //The arrayLists are empty by default, so we have to initialise them by using below
        //initialise
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //Adding elements to the List
        for (int i = 0; i < 3; i++) { //for each ArrayList
            for (int j = 0; j < 3; j++) { //For each element in each ArrayList
                list.get(i).add(in.nextInt()); //Get the indexed list and add user elements to it
            }
        }
        System.out.println(list);
    }
}
