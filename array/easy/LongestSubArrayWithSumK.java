package array.easy;
import java.util.*;
class LongestSubArrayWithSumK {
            public static int LongestArrayWithSum(int[] array,int target){
                int right=0,left=1;
                int maxLength =0;
                int tillIndexSum = array[right];
                while(right<array.length){
                    tillIndexSum+=array[left];
                    while(tillIndexSum>target){
                        tillIndexSum-=right;
                        right++;
                    }
                    if(tillIndexSum == target){
                        maxLength = (maxLength<left-right+1)?left-right+1:maxLength;
                    }
                    if (left == array.length - 1) {
                        right++;
                    } else {
                        left++;
                    }      
                }
                return maxLength;
            }

        public static void main(String[] argument){
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
        System.out.print("What is your target element : ");
        int target = scan.nextInt();
        int result = LongestArrayWithSum(array,target);
        System.out.println("Result "+result);
        scan.close();
    }
}