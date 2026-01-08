public class Basic{
    public static void main(String[]args){
        int[] arr = {3,4,13,13,13,20,40};
        int x = 13;
        int result = binarySearch(arr,x);
        System.out.println(result);
    }

    public static int binarySearch(int[]arr, int x){
        int low = 0;
        int high = arr.length-1;
        int target = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                target = mid;
                low = mid + 1;
            }else if(arr[mid]>x){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return target;
    }
}