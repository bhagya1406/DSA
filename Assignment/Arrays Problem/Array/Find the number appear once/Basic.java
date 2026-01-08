public class Basic{
    public static void main(String[] args) {
        int[]arr = {2,2,1};
        // int[]arr = {4,1,2,1,2};
        int result = SingleOne(arr);
        System.out.println(result);
    }

    public static int SingleOne(int[]arr){
        int ans =0;
        for(int i =0; i<arr.length;i++){
            int count = 0;
            for(int j =0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }

                if(count <= 1){
                    ans = arr[i];
                }
            }
        }
        return ans;
    }
}