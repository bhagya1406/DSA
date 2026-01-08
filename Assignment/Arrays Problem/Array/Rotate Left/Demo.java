public class Demo {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int[]result = RotateLeft(arr);
        for(int i =0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

    public static int[] RotateLeft(int[]arr){
        for(int i = 0;i<arr.length;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = arr[0];
        return arr;
    }
    
}

// o/p:- Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
