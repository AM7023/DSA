package array.medium;
import java.util.*;

public class Sort012Array {

    //first way is to implement any sort and return the sorted array;

    /*second count the 0's 1's and 2's because we already know that this array is only contain the 0's 1's and 2's.
    and after that run three loop for each of one and make a new or assign the value to the array and return that array.*/

    /*This is a algorithm name Datch national flag algorithm */
    public static int[] sortZeroOneTow (int[] array){
        int low = 0;
        int mid = 0;
        int high = array.length-1;
        for (int i = 0; i < array.length; i++) {
            if(array[mid]==0){
                int temp = array[mid];
                array[mid] =array[low];
                array[low] =temp;
                low++;
                mid++;
            }else if(array[mid]==1){
                mid++;
            }else{
                int temp = array[mid];
                array[mid] =array[high];
                array[high] =temp;
                high--;
            }
        }
        return array;
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
        int [] result = sortZeroOneTow(array);
        System.out.print("The sorted array is: [");
        for (int index = 0; index < result.length; index++) {
        System.out.print(result[index]);
        if (index < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        scan.close();
    }
    
}
