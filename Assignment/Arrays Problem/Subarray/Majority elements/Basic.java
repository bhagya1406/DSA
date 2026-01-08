import java.util.HashMap;

public class Basic{

    //N/3 times
    // public static void main(String[]args){
    //     // int[]arr={1,2,2,3,2};
    //     int[]arr={11,33,33,11,33,11};
    //     // int N = 5;
    //     int N = 6;
    //     int result = MajorityElements(arr,N);
    //         System.out.println(result);
    // }

    // public static int MajorityElements(int[]arr,int N){
    //     HashMap<Integer,Integer>hm = new HashMap<>();
    //     int ans = 0;
    //     for(int i =0;i<N;i++){
    //         hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
    //     }
    //     for(int key : hm.keySet()){
    //         if(hm.get(key)>N/3){
    //             ans = key;
    //         }
    //     }
    //     return ans;
    // }

    //N/2 times 
    public static void main(String[]args){
        // int[]arr={3,2,3};
        // int N = 3;
        int[]arr={2,2,1,1,1,2,2};
        int N = 7;
        int result = MajorityElements(arr,N);
            System.out.println(result);
    }

    public static int MajorityElements(int[]arr,int N){
        HashMap<Integer,Integer>hm = new HashMap<>();
        int ans = 0;
        for(int i =0;i<N;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        for(int key : hm.keySet()){
            if(hm.get(key)>N/2){
                ans = key;
            }
        }
        return ans;
    }
}