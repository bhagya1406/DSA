public class p3 {
    public static void main(String[] args) {
        int[]arr = {1 , -2 , 3 , -4};
        ArrayList<ArrayList> result = alternatingSigns(arr , 0 , new ArrayList<>());
        System.out.println(result);
    }

    public static ArrayList<ArrayList> alternatingSigns(int [] arr , int ind , ArrayList<Integer>al){
        if(ind == arr.length){
            return 0;
        }

    }
}
