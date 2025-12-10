package array.medium;
import java.util.*;

public class BuySell {

    public static int makeProfit(int [] array){
        int profit =0 ;
        int min=array[1];
        for (int index = 1; index < array.length; index++) {
            int margin = array[index]-min;
            if(margin>profit){
                profit = margin;
            }
            if(array[index]<min){
                min= array[index];
            }
        }
        return profit;
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
        System.out.println("Max profit that you can make is "+makeProfit(array));
        scan.close();
    }
}
