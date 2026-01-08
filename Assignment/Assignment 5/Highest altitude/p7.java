public class p7{
	public static void main(String[]args){
		// int[]arr={-5,1,5,0,-7};
		int[]arr={-4,-3,-2,-1,4,3,2};
		int ans = Altitude(arr);
		System.out.print(ans);
	}
	
	public static int Altitude(int[]arr){
		int altitude = 0;
		int max = 0;
		for(int i = 0;i<arr.length;i++){
			altitude+=arr[i];
			max = Math.max(max,altitude);
		}
		return max;
	}
}

/* o/p:- 1
	 0
	 TC = O(n)
	 SC = O(1)
*/