import java.util.ArrayList;

public class p1{
    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        int k = 2;
        fun(arr , k , 0 , new ArrayList<>());
    }

    public static void fun(int[]arr , int k , int ind ,  ArrayList<Integer>al){
        // if(ind <= arr.length){
            if(k == al.size()){
                System.out.println(al);
                return;
            // }
        }

        al.add(arr[ind]);
        fun(arr , k , ind+1 , al);
        al.remove(al.size());
    }
}