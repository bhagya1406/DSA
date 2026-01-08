public class p1{
	public static void main(String[]args){
		/*int[]arr={3,1,2,2,2,1,3};
		int k = 2;*/
		int[]arr={1,2,3,4};
		int k = 1;
		int ans = Count(arr,k);
		System.out.print(ans);
	}

	public static int Count(int[]arr, int k){
		int count = 0;
		for(int i = 0; i<arr.length;i++){
			for(int j = i; j<arr.length;j++){
				if(arr[i] == arr[j] && i<j){
					if((i*j)%k == 0){
						count++;
					}
				}
			}
		}
		return count;
	}
}

/* 	o/p:-4
	     0
	TC=O(n^2)
	SC=O(1)
*/