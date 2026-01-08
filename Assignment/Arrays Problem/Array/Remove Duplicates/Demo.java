import java.util.HashMap;

public class Demo{
    public static void main(String[] args) {
        int[]arr={1,1,2,2,2,3,3};
        int[]result = removeDuplicates(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] removeDuplicates(int[]arr){
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i = 0; i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        int ind = 0;
        for(int key: hm.keySet()){
            arr[ind]=key;
            ind++;
        }
        return arr;
    }
}
