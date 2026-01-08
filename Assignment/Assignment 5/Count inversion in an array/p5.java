public class p5{
	public static void main(String[]args){
		//int[]arr={1,2,3,4,5};
		//int[]arr={5,4,3,2,1};
		int[]arr={5,3,2,1,4};
		int N = 5;
		int ans = Inversion(arr);
		System.out.println(ans);
	}

	public static int Inversion(int[]arr){
		int count = 0;
		for(int i =0;i<arr.length;i++){
			for(int j = i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					count++;
				}
			}
		}
		return count;
	}
}

/* o/p:- 0
	 10
	 7
	 TC=O(n^2)
	 SC=O(1)
*/