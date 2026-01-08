// package Floor and Ceil in Sorted Array;

public class P1 {
    public static void main(String[] args) {
        int[] arr = {3,4,4,7,8,10};
        int N = 6;
        int X = 5;
        int[] result = binarySearch(arr,N,X);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] binarySearch(int[]arr, int N, int X){
        int low =0;
        int high = N-1;
        int floor = 0;
        int ceil = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==X){
                floor = arr[mid];
                ceil = arr[mid];
                break;
            } 
            else if(arr[mid]<X){
                floor=arr[mid];
                low = mid - 1;
            }else{
                ceil = arr[mid];
                high = mid + 1;
            }
        }
        return new int[] {floor,ceil};
    }
}
