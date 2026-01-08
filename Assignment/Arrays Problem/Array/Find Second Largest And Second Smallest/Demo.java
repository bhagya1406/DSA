import java.util.*;

public class Demo{
    public static void main(String[]args){
        int[]arr={1,2,4,7,7,5};
        int smallest = SmallestElement(arr);
        System.out.println(smallest);
        int largest = LargestElement(arr);
        System.out.println(largest);
    }

    public static int SmallestElement(int[]arr){
        Arrays.sort(arr);
        int min = arr[1];
        return min;
    }

    public static int LargestElement(int[]arr){
        Arrays.sort(arr);
        int max = arr[arr.length-2];
        return max;
    }
}