import java.util.ArrayList;
import java.util.Arrays;

public class p1{
    public static void main(String[]args){
        int[]arr = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(arr);
        combinationSum(arr , target , 0 , new ArrayList<>());
    }

    public static void combinationSum(int[]arr , int target , int ind , ArrayList<Integer>al){
        if(target == 0){
            System.out.println(al);
            return;
        }

        for(int i = ind; i<arr.length; i++){
            if(i>ind && arr[i] == arr[i-1]){
                continue;
            }

            if(arr[i] > target){
                break;
            }
            al.add(arr[i]);
            combinationSum(arr, target-arr[i], i+1, al);
            al.remove(al.size()-1);
        }
    }
}