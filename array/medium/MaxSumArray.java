package array.medium;
import java.util.*;

public class MaxSumArray {
    //kadane's algo. 
    public static int MaximumSumArrayLength(int [] array){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum +=array[index];
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum= 0 ;
            }
        }
        return maxSum;
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
    }
}
