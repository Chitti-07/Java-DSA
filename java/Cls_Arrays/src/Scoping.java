import org.w3c.dom.ls.LSOutput;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;   //we can initialise it and use is inside this function, can be updated out of this fun
        int b = 20;
        System.out.println(a);
        {
            a = 30;  //it can be updated but cannot be used outside the block(called block scoping)
            //we can initialise , but we cannot use it outside
            System.out.println(a);
        }
        System.out.println(a);
        sum();
    }
    static void sum(){
        int a = 14;  //we can again create different variable with same name , it can be used within this function only
        System.out.println(a);

    }
}
//This is all about the scoping -> functional scoping
//                               -> block scoping