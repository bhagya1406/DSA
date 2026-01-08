public class Basic{
    public static void main(String[]args){
        // int[] arr = {7,1,5,3,6,4};
        int[] arr = {7,6,4,3,1};
        int profits = MaxProfit(arr) ;
        System.out.println(profits);
    }

    public static int MaxProfit(int[]arr){
        int max = 0;
        int profit = 0;
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    profit= arr[j] - arr[i];
                    max = Math.max(max, profit);
                }
                return 0;
            }
        }
        return max;
    }
}