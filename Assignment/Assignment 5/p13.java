public class p13{
	public static void main(String[]args){
		int[]arr={2,10,7,5,4,1,8,6};
		int result = Remove(arr);
		System.out.print(result);
	}

	public static int Remove(int[]arr){
		int count = 0;
		int min = 0;
		int max = 0;
		
		for(int i = 0;i<arr.length;i++){
			min = Math.min(min,arr[i]);
			if(arr[i]==min){
				for(int j = i; j<arr.length;j++){
					count++;
				}
			}

		}

		for(int i =0;i<arr.length;i++){
			max = Math.max(max,arr[i]);
			if(arr[i]==max){
				for(int j = i;j>=0;j--){
					count++;
				}
			}

		}
		
		//for(int i = 0;i<arr.length;i++){
		//	if(arr[i]==max){
		//		for(int j = i;j>=0;j--){
		//			count++;
		//		}
		//	}
		//	if(arr[i]==min){
		//		for(int j = i; j<arr.length;j++){
		//			count++;
		//		}
		//	}
		//}
		return count;
	}
}