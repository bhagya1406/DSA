import java.util.ArrayList;

public class p1{
    public static void main(String[]args){
        int[] arr = {1,2,3};
        generateSubsequence(arr ,  0 , new ArrayList<>()); 
    }

    public static void generateSubsequence(int[]arr, int ind , ArrayList<Integer> al ){
        if(ind == arr.length){
            System.out.println(al);
            return;
        }

        al.add(arr[ind]);
        generateSubsequence(arr, ind+1, al);

        al.remove(al.size()-1);
        generateSubsequence(arr, ind+1, al);
    }
}

