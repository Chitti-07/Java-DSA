public class MethodOverloading {
    public static void main(String[] args) {

        sum(12,23,34);//Here same name of funcs are defined, but it overloads the func by following arguments

    }
    static void sum(int a, int b){ // this function can be called when a fun with two parameters are given
        int s = a + b;
        System.out.println(s);
    }
    static void sum(int a,int b, int c){ //this function can be called when a fun with three parameters are given
        int s = a + b +c;
        System.out.println(s);
    }
}
