import java.util.*;

public class p1{
	public static void main(String[]args){
		int[] arr = {1,2,1};
		int k = 2;
		subsequenceSum(arr , k , 0 , 0 , new ArrayList<>());
	}

	public static void subsequenceSum(int[] arr , int k , int sum , int ind , ArrayList<Integer> al ){
		if(ind == arr.length){
			if(sum == k){
				System.out.println(al);
			}
			return;
		}

		al.add(arr[ind]);
		subsequenceSum(arr , k , sum+arr[ind] , ind+1 , al);

		al.remove(al.size()-1);
		subsequenceSum(arr , k , sum , ind+1 , al);
	}
}
