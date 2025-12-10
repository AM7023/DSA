package array.medium;

import java.util.*;

public class MajorityElement {
    //this is the best approach to resolve this problem because this is talking n*logn
    public static int findMajorityElement(int[] array) {
        int MajorityElementCount = (array.length / 2)+1;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                int count = hashMap.get(array[i]);
                hashMap.put(array[i], ++count);
            } else {
                hashMap.put(array[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() >= MajorityElementCount) {
                return entry.getKey();
            }
        }
        return -1;
    }

    //this is the one of the most optimal approach to solve this problem
    public static int findMajorityElementOptimal(int [] array){
        int majorityElement = 0;
        int count = 0;
        for (int index = 0; index < array.length; index++) {
            if(count==0){
                majorityElement = array[index];
                count++;
            }else if(array[index]==majorityElement){
                count++;
            }else{
                count--;
            }
        }
        return majorityElement;
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
        System.out.println("Major element is "+findMajorityElement(array));
        scan.close();
    }
}
