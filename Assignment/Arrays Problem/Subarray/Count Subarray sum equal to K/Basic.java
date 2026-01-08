public class Basic{
    public static void main(String[] args) {
        // int[]arr={3,1,2,4};
        int[]arr={1,2,3};
        // int N = 4;
        int N = 3;
        // int k =6;
        int k =3;
        int result = SubArray(arr,N,k);
        System.out.println(result);
    }
    
    public static int SubArray(int[]arr,int N , int k){
        int count = 0;
        int sum =0;
        for(int i =0;i<N;i++){
            sum+=arr[i];
            if(sum==k){
                count++;
                sum=0;
                i--;
            }
        }
        return count;
    }
}