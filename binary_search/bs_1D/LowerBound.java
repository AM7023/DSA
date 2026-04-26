package binary_search.bs_1D;

import java.util.Scanner;

import array.easy.IsSortedArray;

public class LowerBound {

    static int FindLowerBound(int[] arr, int target) {

        if (arr[0] > target) {
            return arr.length;
        }

        int low = 0;

        int high = arr.length - 1;

        int mid = low + ((high - low) / 2);

        int closestIndex = 0;

        while (high >= low) {
            if (arr[mid] == target) {
                closestIndex = mid;
                break;
            } else {
                if (arr[closestIndex] < arr[mid] && arr[mid] < target) {
                    closestIndex = mid;
                }
                boolean isTargetIsOnRight = target > arr[mid];
                low = isTargetIsOnRight ? mid + 1 : low;
                high = isTargetIsOnRight ? high : mid - 1;
                mid = low + ((high - low) / 2);
            }

        }
        do {
            low = 0;
            if (arr[closestIndex - 1] == target) {
                --closestIndex;
            } else {
                break;
            }

        } while (low <= closestIndex);

        return closestIndex + 1;

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

        System.out.print("Enter the element to search: ");
        int x = scan.nextInt();
        int result = FindLowerBound(arr, x);

        if (result == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is present at index " + result);
        }
        scan.close();
    }
}