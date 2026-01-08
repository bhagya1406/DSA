public class p6{
	public static void main(String[]args){
		// int[]arr={5,7,7,8,8,10};
		// int target = 8;
		// int[]arr={5,7,7,8,8,10};
		// int target = 6;
		int[]arr={};
		int target = 0;
		int[]ans = Position(arr , target);
		for(int i = 0;i<ans.length;i++){
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] Position(int[]arr , int target){
		int[]result = {-1,-1};
		for(int i = 0;i<arr.length;i++){
			if(arr[i]==target){
				result[0] = i;
				break;
			}
		}
		for(int j = i+1; j<arr.length;j++){
			if(arr[j]==target){
				result[1] = j;
			}
		}
		return result;
	}
}

/* o/p:- {3,4}
	 {-1,-1}
	 {-1,-1}
	 TC = O(n^2)
	 SC = O(1)
*/