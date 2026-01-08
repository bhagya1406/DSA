public class P1 {
    public static void main(String[] args) {
        int[]arr = {3,4,4,7,8,10};
        int X = 5;
        int result = Floor(arr,X);
        int result1 = Ceil(arr,X);

        System.out.println(result);
        System.out.println(result1);

    }

    public static int Floor(int[] arr , int X){
        int low = 0;
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

    public static int Ceil(int[] arr, int X){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=X){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
