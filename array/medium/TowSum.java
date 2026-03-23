package array.medium;

import java.util.HashMap;
import java.util.Scanner;

import sorting.sorting_1.Insertion;

class TowSum {

    public static boolean isTowSumPresent(int[] array, int target) {
        int[] sortedArray = Insertion.InsertionSort(array);
        int i = 0, j = sortedArray.length - 1;
        while (i < j) {
            int sum = sortedArray[i] + sortedArray[j];
            if (sum == target) {
                return true;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static int[] giveMeIndexForTwoSum(int[] array, int target) {
        HashMap<Integer, Integer> hashSet = new HashMap<Integer, Integer>();
        for (int index = 0; index < array.length; index++) {
            int rest = target - array[index];
            if (hashSet.containsKey(rest)) {
                return new int[] { hashSet.get(rest),index };
            } else {
                hashSet.put(array[index], index);
            }
        }
        return null;
    }

    public static void main(String[] argument) {
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
        System.out.print("Enter the target :");
        int target = scan.nextInt();
        boolean result = isTowSumPresent(array, target);
        if (result) {
            int[] indexOfTowSum = giveMeIndexForTwoSum(array, target);
            System.out.print("Yes target is present and the index's are : [");
            for (int index = 0; index < indexOfTowSum.length; index++) {
                System.out.print(indexOfTowSum[index]);
                if (index < indexOfTowSum.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        } else {
            System.out.println("Target " + target + "is not present in this array");
        }
        scan.close();
    }
}