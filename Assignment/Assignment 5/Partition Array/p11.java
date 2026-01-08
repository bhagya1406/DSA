public class p11{
	public static void main(String[]args){
		int[] arr={9,12,5,10,14,3,10};
		int k=10;
		int[] result=Partition(arr,k);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]);
		}
	}

	public static int[] Partition(int[]arr,int k){
		int[] temp=new int [arr.length];		
		int ind = 0;

		for(int i=0;i<=arr.length;i++){
			if(arr[i]<=k){
	  		temp[ind++]=arr[i];
			}
		}
	
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>k){
				temp[ind++]=arr[i];
			}
		}
		return temp;
	}	
}