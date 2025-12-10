import java.util.*;

package java.medium.*;

/*
    Given an array, print all the elements which are leaders.
    A Leader is an element that is greater than all of the elements on its right side in the array.
 */

public class FindLeader {

    public static int[] findLead(int[] array){
        return new int[3];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers you want to insert in the array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the numbers:");
        for (int index = 0; index < array.length; index++) {
            array[index] = scan.nextInt();
        }
        
        System.out.print("The original array is: [");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
            if (index < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        scan.close();
        findLead()
    }
    
}
