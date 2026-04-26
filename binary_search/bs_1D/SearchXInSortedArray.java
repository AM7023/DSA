package binary_search.bs_1D;

import java.util.Scanner;

import array.easy.IsSortedArray;

public class SearchXInSortedArray {

    static int BSSearch(int[] arr, int target, int low, int high) {

        int mid = low + ((high - low) / 2);

        if (high < low) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        } else {
            boolean isTargetIsOnRight = target > arr[mid];
            int newLow = isTargetIsOnRight ? mid + 1 : low;
            int newHigh = isTargetIsOnRight ? high : mid - 1;

            return BSSearch(arr, target, newLow, newHigh);

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        if (IsSortedArray.arraySortedChecker(arr)) {
            System.out.print("Enter the element to search: ");
            int x = scan.nextInt();
            int low = 0;
            int high = arr.length - 1;
            int result = BSSearch(arr, x, low, high);

            if (result == -1) {
                System.out.println("Element is not present in the array");
            } else {
                System.out.println("Element is present at index " + result);
            }

        } else {
            System.out.println("Array is not sorted");
        }
        scan.close();
    }
}
