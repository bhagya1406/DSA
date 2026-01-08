// package Search Insert Position;

public class Basic {
    public static void main (String[]args){
        int[] arr = {1,2,4,7};
        int X = 5;
        int result = binarySearch(arr,X);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int X){
        int low =0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=X){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
