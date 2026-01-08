public class p1{
	public static void main(String[]args){
		int[] arr = {1,2,1};
		int k = 2;
		boolean ans = subsequenceSum(arr , k , 0 , 0 );
		System.out.println(ans);
	}

	public static boolean subsequenceSum(int[] arr , int k , int sum , int ind ){
		if(ind == arr.length){
			if(sum == k){
				return true;
			}

			return false;
		}

		if(subsequenceSum(arr , k , sum+arr[ind] , ind+1) == true ){
			return true;
		}

		if(subsequenceSum(arr , k , sum , ind+1) == true){
			return true;
		}

		return false;
	}
}
