//Recursivr Approach
public class Basic {
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,12,14,16};
        int K =6;
        int low =0;
        int high = arr.length-1;
        int result = binarySearch(arr,K , low, high);
        System.out.println(result);
    }
    public static int binarySearch(int[] arr, int K , int low, int high){
        if (low>high) {
            return -1;
        }
        int mid = (low+high)/2;
        if (arr[mid]==K){
            return mid;
        }else if(arr[mid]>K){
            return binarySearch(arr, K, low, mid-1);
        }else{
            return binarySearch(arr, K, mid+1, high);
        }
    }
}
