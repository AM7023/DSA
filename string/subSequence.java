package string;

import java.util.*;

public class subSequence {

    static boolean isSubSequence(String parentStr, String childStr) {
        int childPointer = 0;
        if (childStr.length() > parentStr.length()) {
            return false;
        }

        for (int i = 0; i < parentStr.length() && (childPointer < childStr.length()); i++) {
            if (parentStr.charAt(i) == childStr.charAt(childPointer)) {
                ++childPointer;
            }
        }

        return childPointer == childStr.length();
    }

    // TODO Write a recursive solution for this.

    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String inpchut = scan.next();

        System.out.println(isSubSequence(input, inpchut) ? "yes" : "No");
        scan.close();

    }

}