// Java program to check whether a
// string is a Palindrome
// Using two pointing variables

import java.util.Scanner;

// Main class
public class IsPalindrome {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Input string
        String str = in.next();

        // Convert the string to lowercase
        str = str.toLowerCase();
        // passing bool function till holding true
        if (isPalindrome(str))

            // It is a palindrome
            System.out.print("Yes");
        else

            // Not a palindrome
            System.out.print("No");
    }

    // Method
    // Returning true if string is palindrome
    static boolean isPalindrome(String str)
    {

        // Pointers pointing to the beginning
        // and the end of the string
        int start = 0, end = str.length() - 1;

        // While there are characters to compare
        while (start < end) {

            // If there is a mismatch
            if (str.charAt(start) == str.charAt(end))
                return true;

            // Increment first pointer and
            // decrement the other
            start++;
            end--;
        }
        // Given string is a palindrome
        return true;
    }

}
