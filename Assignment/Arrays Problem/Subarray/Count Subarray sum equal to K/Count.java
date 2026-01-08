import java.util.HashMap;

public class Count {
    public static void main(String[] args) {
        // int[]arr={3,1,2,4};
        int[]arr={1,2,3};
        // int N = 4; 
        int N = 3;
        // int k=6;
         int k =3;
        int result = SubArray(arr,k,N);
        System.out.println(result);
    }

    public static int SubArray(int[]arr,int k, int N){
        HashMap<Integer,Integer>hm = new HashMap<>();
        int count = 0;
        int sum =0;
        hm.put(0,1);
        for(int i=0;i<N;i++){
            sum+=arr[i];
            count+=hm.getOrDefault(sum-k,0 );
            hm.put(sum,hm.getOrDefault(sum, 0)+1);
        }
        return count;
    }
    
}
