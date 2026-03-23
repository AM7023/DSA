package sorting.sorting_2;
import java.util.*;

public class Merge {

    public static void MergeFunc(int[] arr, int low, int mid, int high) {
        System.out.print("high" + high + " low : " + low + " mid : " + mid );
        int size = mid - low + 1;
        int size2 = high - mid;
        int[] leftArray = new int[size];
        int[] rightArray = new int[size2];
        for (int i = low; i < high; i++) {
            if (i <= mid) {
                leftArray[i] = arr[i];
            } else {
                rightArray[i - size] = arr[i];
            }
        }
        int i = 0;
        int j = 0;
        int k = low;
        System.out.print("Sort Array is : [");
        for (int il : leftArray) {
            System.out.print(il + ",");
        }
        System.out.print("]");
        System.out.print("Sort Array is : [");
        for (int ir : rightArray) {
            System.out.print(ir + ",");
        }
        System.out.print("]");
        while (i < size && j < size2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < size) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < size) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void MergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
       
        System.out.print("low => mid => " + low + +mid+" \nmid+1,=>high => " + (mid+1) +high+"\n");
        MergeSort(arr, low, mid);
        MergeSort(arr, (mid + 1), high);
        MergeFunc(arr, low, mid, high);
        System.out.print("Sort Array is with high" + high + " low : " + high + " mid : " + mid + ": [");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("]");
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

        MergeSort(array, 0, size-1);
        System.out.print("Sort Array is : [");
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.print("]");
        scan.close();
    }
}
