import java.util.*;

public class RecursiveBubble {

    public static int[] RecursiveBubbleSort(int[] arr) {
        
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many number you want to insert in array : ");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Start entering number the you want to insert :");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        System.out.print("Original Array is : [");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("]");
        int[] result = RecursiveBubbleSort(array);
        System.out.print("Sort Array is : [");
        for (int i : result) {
            System.out.print(i + ",");
        }
        System.out.print("]");
        scan.close();
    }
}
