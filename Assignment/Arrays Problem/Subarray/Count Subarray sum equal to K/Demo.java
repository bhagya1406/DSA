public class Demo {
    public static void main(String[] args) {
        // int[]arr={3,1,2,4};
        int[]arr={1,2,3};
        // int N = 4;
        int N = 3;
        // int k = 6;
         int k =3;
        int result = SubArray(arr,N,k);
        System.out.println(result);
    }

    public static int SubArray(int[]arr,int N,int k){
        int count = 0;
        for(int i = 0; i<N;i++){
            int sum = 0;
            for(int j =i; j<N;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    
}
