// Iterativr approach

public class Demo{
    public static void main(String[] args) {
        int[] arr={2,3,6,9,12,14,16};
        int k=6;    
        int result = binarySearch(arr, k);
        System.out.println(result);
    }

    public static int binarySearch(int[]arr , int k){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid]> k){
                high =  mid - 1;
            } 
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}