package string;

import java.util.*;

public class palindrome {

    static boolean isPalindrome(String str) {
        int right = str.length() - 1;
        int left = 0;
        while (left < right) {
            if (str.charAt(right) != str.charAt(left)) {
                return false;
            }
            ++left;
            --right;
        }
        return true;

    }

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println(isPalindrome(input) ? "yes" : "No");

    }
}