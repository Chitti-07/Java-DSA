public class Pangram_Or_Not {

//    A pangram is a sentence where every letter of the English alphabet appears at least once.
//    Given a string sentence containing only lowercase English letters,
//            return true if sentence is a pangram, or false otherwise.
//
//    Example 1:
//    Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//    Output: true
//    Explanation: sentence contains at least one of every letter of the English alphabet.

    static boolean ispangram(String sentence){
        boolean[] arr = new boolean[26];//creating a new boolean array
        for(int i = 0; i < sentence.length(); i++){//iterating through the sentence & sub from ASCII value
            arr[sentence.charAt(i) - 97] = true;//if it is small alph then it is true
        }

        for(int i = 0; i < 26; i++){//iterating through newly formed boolean array
            if(arr[i] == false){//return false if any element is false
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = ispangram(sentence);
        System.out.println(ans);
    }
}
