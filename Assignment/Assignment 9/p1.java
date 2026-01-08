class Demo{
    public static void main(String[]args){
        // int[]arr = {2,4,1};
        int[]arr = {1,2,3,4,5,6,7};
        int result = subsequenceWithEvenSum(arr , 0 , 0 );
        System.out.println(result);
    }

    public static int subsequenceWithEvenSum(int[]arr , int ind , int sum ){
        if(ind == arr.length){
            if(sum %2 == 0 && sum!=0){
                return 1;
            }
            else{
                return 0;
            }
        }

        int include = subsequenceWithEvenSum(arr, ind+1, sum+arr[ind]);
        
        int exclude = subsequenceWithEvenSum(arr, ind+1, sum);
        
        return include + exclude;
    }
}