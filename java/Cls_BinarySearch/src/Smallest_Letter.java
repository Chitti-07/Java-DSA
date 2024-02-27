public class Smallest_Letter {

    public static void main(String[] args) {
        char[] letters = {'c', 'h', 't', 'j'};
        char target = 't';
        char ans = smallest(letters,target);
        System.out.println(ans);
    }

    static char smallest(char[] letters, char target) {


        int start = letters[0];
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length ];
    }
}
