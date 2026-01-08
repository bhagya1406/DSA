public class p1{
	public static void main(String[]args){
		int [] arr = {1,2,1};
		int k = 2;
		int count = 0;
		int ans = countSubsequence(arr , k , 0 , 0);
		System.out.println(ans);
	}

	public static int countSubsequence(int[]arr , int k , int ind , int sum){
		if(ind == arr.length){
			if(k == sum){
				return 1;
			}
			return 0;
		}

		int pick = countSubsequence(arr , k , ind+1 , sum+arr[ind]);

		int not_pick = countSubsequence(arr , k , ind+1 , sum);

		return pick + not_pick;
	} 
}