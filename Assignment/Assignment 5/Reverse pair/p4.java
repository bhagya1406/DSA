public class p4{
	public static void main(String[]args){
		// int[]arr={1,3,2,3,1};
		int[]arr={2,4,3,5,1};
		int ans = ReversePair(arr);
		System.out.print(ans);
	}

	public static int ReversePair(int[]arr){
		int count = 0;
		for(int i =0;i<arr.length;i++){
			for(int j = i;j<arr.length;j++){
				if(arr[i]>(2*arr[j])){
					count++;
				}
			}
		}
		return count;
	}
}

/* o/p:- 2
	 3
	 TC=O(n^2)
	 SC=O(1)
*/