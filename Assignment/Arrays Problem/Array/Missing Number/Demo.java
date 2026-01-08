public class Demo {
    public static void main(String[] args) {
        int[]arr={1,2,4,5};
        int N = 5;
        int result = MissingNumber(arr,N);
        System.out.println(result);
    }
    
    public static int MissingNumber(int[]arr,int N){
        int totalsum = (N*(N+1)/2);

        int arrsum = 0;
        for(int i =0;i<arr.length;i++){
            arrsum+=arr[i];
        }

        return totalsum-arrsum;
    } 
    
}
