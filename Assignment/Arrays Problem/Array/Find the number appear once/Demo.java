public class Demo {
    public static void main(String[] args) {
        // int[]arr = {2,2,1};
        int[]arr = {4,1,2,1,2};
        int result = SingleOne(arr);
        System.out.println(result);
    }

    public static int SingleOne(int[]arr){
        int array =0;
        for(int i =0;i<arr.length;i++){
            array = array ^ arr[i] ;
        }
        return array;
}
}
