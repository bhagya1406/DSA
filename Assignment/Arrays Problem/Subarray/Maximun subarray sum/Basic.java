public class Basic{
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        // int [] arr = {1};
        int result = MaximumSubarraySum(arr);
        System.out.println(result);
    }

    public static int MaximumSubarraySum(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length; i++){
            int sum =0;
            for(int j = i+1 ; j<arr.length ; j++){
                sum+=arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}