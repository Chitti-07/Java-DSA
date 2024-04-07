
public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(decimal(101));
    }
    static int decimal(int binary){
        int dec = 0, i = 0;//Initialising decimal and i
        while(binary > 0){//Iterate until the binary
            int rem = binary % 10;//We get the last digit of binary 100 -> 0
            binary /= 10;//Compress the binary
            dec += rem * Math.pow(2, i);// multiply the num with 2^n
            i++;
        }
        return dec;
    }
}
