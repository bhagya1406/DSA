import java.util.Arrays;

public class Demo
{
    public static void main(String[] args) {
        // int[]arr={-55,-54,-24,-7};
        int[] arr = {5,10,7,8,9};
        int result = LargestElement(arr);
        System.out.println(result);
    }
    public static int LargestElement(int[]arr){
        Arrays.sort(arr);
        int num = arr[arr.length-1];
        return num;
    }
}