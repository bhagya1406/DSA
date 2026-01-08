public class Demo {
    public static void main(String[] args) {
        // int[]arr = {1,2,3,4,5};
        int[]arr = {4,5,6,8,7};
        boolean result = SortedArray(arr);
        System.out.println(result);
    }

    public static boolean SortedArray(int[]arr){
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
            return true;

    }
    
}
