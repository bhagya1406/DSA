public class Demo {

    // N/3 times 

    // public static void main(String[] args) {
    //     // int[]arr={1,2,2,3,2};
    //     // int N = 5;
    //     int[]arr={11,33,33,11,33,11};
    //     int N =6;
    //     int result = MajorityElements(arr,N);
    //     System.out.println(result);
    // }

    // public static int MajorityElements(int[]arr,int N){
    //     int candidate = 0;
    //     int votes = 0;
    //     for(int i = 0;i<N;i++){
    //         if(votes==0){
    //             candidate=arr[i];
    //             votes++;
    //         }
    //         else if (candidate==arr[i]){
    //             votes++;
    //         }
    //         else{
    //             votes--;
    //         }
    //     }
    //     return candidate;
    // }

    //N/2 times
    public static void main(String[] args) {
        // int[]arr={3,2,3};
        // int N = 3;
        // int[]arr={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        // int N =arr.length;
        int[]arr={2,2,1,1,1,2,2};
        int N = 7;
        int result = MajorityElements(arr,N);
        System.out.println(result);
    }

        public static int MajorityElements(int[]arr,int N){
        int candidate = 0;
        int votes = 0;
        for(int i = 0;i<N;i++){
            if(votes==0){
                candidate=arr[i];
                votes++;
            }
            else if (candidate==arr[i]){
                votes++;
            }
            else{
                votes--;
            }
        }
        return candidate;
    }
    
}
