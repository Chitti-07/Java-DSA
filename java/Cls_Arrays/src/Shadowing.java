public class Shadowing {
    static int a = 10;//it is available to the whole class / we use static to make it obj independent

    public static void main(String[] args) {
        System.out.println(a); // here it prints the  value of 10 (universal variable)

        int a; //we declared a variable, it shadowed the universal(10), from now onwards whatever changes we do it only applicable for this variable only
        //System.out.println(a); //it gives u an error as the override variable is just declared, but do not have any value

        a = 20; // as we initialise it we can now print it
        System.out.println(a); // it will print the value 20

        sum();
    }
    static void sum(){
        System.out.println(a); //it'll print the value of universal(10)
    }

}
