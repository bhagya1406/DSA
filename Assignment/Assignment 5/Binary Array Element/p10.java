public class p10{
	public static void main(String[]args){
		// int []arr={0,1,1,1,0,0};
		int[] arr={0,1,1,1};
  		int result = BinaryArray(arr);
        	System.out.println(result);
	}
	
	public static int BinaryArray(int[]arr){
		int operation=0;
		int index=0;
		while(index < arr.length-2){
			if(arr[index]==1 && arr[index+1]==1&& arr[index+2]==1){
				index++;
			}
			else{
				operation++;
				index++;
			}
		}
		return operation;
	}
}

//3