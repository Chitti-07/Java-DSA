public class FindNumOfDig {
    public static void main(String[] args) {
        int[] arr = {112,345,234,12,4356,1223,78584675};
        int ans = FindNum(arr);
        System.out.println(ans);
    }

    static int FindNum(int[] nums){
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        return digits(num) % 2 == 0;
    }

    static int digits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
