public class Basic{
    public static void main(String[] args) {
        int [] arr ={2,6,5,8,11};
        int target =14;
        int[]ans = Sum(arr,target);
        for(int i =0; i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] Sum(int[]arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                   return new int[] {arr[i] , arr[j]}; 
                }
            }
        }
        return new int[]{-1,-1}; 
    }
}