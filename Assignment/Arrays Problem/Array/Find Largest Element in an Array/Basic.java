

public class Basic {
    public static void main(String[] args) {
        int[]arr={-55,-54,-24,-7};
        // int[] arr = {5,10,7,8,9};
        int result = LargestElement(arr);
        System.out.println(result);
    }

    public static int LargestElement(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}
