import java.util.ArrayList;
import java.util.HashMap;

public class Basic{
    public static void main(String[] args) {
        // int [] arr1 ={1,2,3,4,5};
        // int [] arr2 = {2,3,4,4,5};
        int [] arr1 ={1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = {2,3,4,4,5,11,12};
        int[]result=Union(arr1,arr2);
        for(int i =0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] Union(int[]arr1, int[]arr2){
        HashMap<Integer,Integer>hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0;i<arr1.length;i++){
            hm.put(arr1[i] ,hm.getOrDefault(arr1[i] , 0) +1);

        }

        for(int i =0;i<arr2.length;i++){
            hm.put(arr2[i] ,hm.getOrDefault(arr2[i] , 0) +1);
        }

        for (int key : hm.keySet()) {
            al.add(key);
        }

        int[] result = new int[al.size()];
        for(int i =0;i<al.size();i++){
            result[i] = al.get(i);
    }

    return result;
}
}

// o/p:- 1 2 3 4 5 