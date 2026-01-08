public class Basic{
    public static void main(String[]args){
        int[]arr={1,2,3,4,5};
        int num = 3;
        int result = LinearSearch(arr,num);
        System.out.println(result);
    }

    public static int LinearSearch(int[]arr , int num){
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==num){
                ans = i;
            }
        }
        return ans;
    }
}