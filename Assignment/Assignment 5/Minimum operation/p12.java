public class p12{
	public static void main(String[] args) {
        	// int[] arr = {1,5,2,4,1};
		int[] arr = {1,1,1};
		int result = Operation(arr);
        	System.out.println(result); 
    	}
    
	public static int Operation(int[] arr) {
        	int count= 0;

        	for (int i = 1; i < arr.length; i++) {
			if (arr[i] <= arr[i - 1]) {
                	int diff = arr[i - 1] - arr[i] + 1;
                	count += diff;
                	arr[i] += diff; 
            		}
        	}

        	return count;
	}
}

/* o/p:- 14
	 3
	 TC = O(n)
*/
