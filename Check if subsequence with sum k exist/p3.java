import java.util.*;
public class p3{
	public static void main(String[]args){
		int[] arr = {1,2,1};
		int k = 2;
		subsequenceSum(arr , k , 0 , 0 , new ArrayList<>());
	}

	public static boolean subsequenceSum(int[] arr , int k , int sum , int ind , ArrayList<Integer>al ){
		if(ind == arr.length){
			if(sum == k){
				System.out.println(al);
				return true;
			}

			return false;
		}

		al.add(arr[ind]);
		if(subsequenceSum(arr , k , sum+arr[ind] , ind+1 , al) == true ){
			return true;
		}

		al.remove(al.size()-1);
		if(subsequenceSum(arr , k , sum , ind+1 , al) == true){
			return true;
		}

		return false;
	}
}
