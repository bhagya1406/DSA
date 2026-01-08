import java.util.ArrayList;
import java.util.HashSet;

public class Demo {
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
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i =0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        for (int key : set){
            al.add(key);
        }

        int[] result = new int[al.size()];
        for(int i =0;i<al.size();i++){
            result[i] = al.get(i);
    }

    return result;
    }
    
}
