public class Missing {
    public static void main(String[] args) {
        int[]arr={1,2,4,5};
        int N = 5;
        int result = MissingNumber(arr,N);
        System.out.println(result);
    }
    
    public static int MissingNumber(int[]arr,int N){
        int total = 0;
        int array = 0;

        for(int i =0;i<arr.length;i++){
            total = total^(i+1);
            array = array ^ arr[i];
        }

        total = total^N;
        return total^array;
    }
}
