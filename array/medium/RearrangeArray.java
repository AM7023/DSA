package array.medium;
import java.util.*;
/* problem Statement:
    There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
    Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.
*/
public class RearrangeArray {
    /*Note: this function is fully depend upon that fact that  passing array always have to have equal no. of negative and positive if the no.
    if positive and negative will change then this function won't work*/
    public static int[] RearrangeArrayWithEqualPositiveNegative(int[] array){
        int []result =  new int[array.length];
        int positivePointer=0;
        int negativePointer=0;
        for (int i = 0; i < result.length; i++) {
            if(array[i]>0){
                result[positivePointer]=array[i];
                positivePointer=positivePointer+2;
            }else{
                result[negativePointer]=array[i];
                negativePointer=negativePointer+2;
            }
        }
        return result;
    }
    /*Note: this function is not depend upon the count of positive and negative and if one of them is greater then then other then it will
        arrange till is possible and after the put all the remaining element last of the array
    */
    public static int[] RearrangeArrayWithPositiveNegative(int[] array){
        ArrayList<Integer> positiveArray=new ArrayList<Integer>();
        ArrayList<Integer> negativeArray=new ArrayList<Integer>();
        for (int index = 0; index < array.length; index++) {
            if(array[index]>0){
                positiveArray.add(array[index]);
            }else{
                negativeArray.add(array[index]);

            }
        }
        if(positiveArray.size()>negativeArray.size()){
            for (int index = 0; index < negativeArray.size(); index++) {
                array[index*2]= positiveArray.get(index);
                array[index*2+1]= negativeArray.get(index);
            }
            int arrayIndex = negativeArray.size()*2;
            for (int index = negativeArray.size(); index < positiveArray.size(); index++) {
                array[arrayIndex]= positiveArray.get(index);
            }
        }else{
            for (int index = 0; index < positiveArray.size(); index++) {
                array[index*2]= positiveArray.get(index);
                array[index*2+1]= negativeArray.get(index);
            }
            int arrayIndex = positiveArray.size()*2;
            for (int index = positiveArray.size(); index < negativeArray.size(); index++) {
                array[arrayIndex]= negativeArray.get(index);
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
        int[] result = RearrangeArrayWithPositiveNegative(array);
        System.out.print("Arrange order is: [");
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
