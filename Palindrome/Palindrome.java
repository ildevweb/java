package Palindrome;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        String original = s.toLowerCase();

        String rev = new StringBuilder(original).reverse().toString();

        if (original.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }
}