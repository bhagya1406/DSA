// package Implement Upper Bound;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {3,5,8,9,15,19};
        int N = 6;
        int X = 9;
        int number = binarySearch(arr,N,X);
        System.out.println(number);
    }

    public static int binarySearch(int[] arr, int N , int X ){
        int low = 0;
        int high = arr.length -1 ;
        int ans = arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>X){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
