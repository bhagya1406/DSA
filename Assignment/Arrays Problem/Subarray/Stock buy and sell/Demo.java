public class Demo {
    public static void main(String[] args) {
        // int[]arr = {7,1,5,3,6,4};
        int[]arr={7,6,4,3,1};
         int profits = MaxProfit(arr) ;
        System.out.println(profits);
    }

    public static int MaxProfit(int[]arr){
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            min = Math.min(arr[i], min);
            max = Math.max(max, arr[i]-min);
        }
        return max;
    }
    
}
