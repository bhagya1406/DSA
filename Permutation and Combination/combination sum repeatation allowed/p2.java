import java.util.*;
public class p2{
	public static void main(String[]args){
		// int[]arr = {2,3,6,7};
		// int target = 7;
		// int[]arr = {2,3,5};
		// int target = 8;
		int[]arr = {1,2,3,4,5,6,7};
		int target = 13;
		combinationSum(arr , target , 0 , new ArrayList<>());
	}

	public static void combinationSum(int[]arr , int target , int ind , ArrayList<Integer>al){
		if(target == 0){
			System.out.println(al);
			return;
		}
		
		if(target<0 || ind == arr.length){
			return;
		}

		al.add(arr[ind]);
		combinationSum(arr , target-arr[ind], ind, al);

		al.remove(al.size()-1);
		combinationSum(arr , target , ind+1 , al);
	}
}