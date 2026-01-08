public class p2{
	public static void main(String[]args){
		int[][]gold = {{1,3,3,22} , {2,1,3,1} , {0,6,4,7} , {1,3,2,8}};
		int sum = 0;
		for(int i = 0; i<gold.length;i++){
			int goldCollected = goldMine(gold , i , 0);
			sum = Math.max(sum , goldCollected);
		}
		System.out.println(sum);
	}

	public static int goldMine(int[][]gold , int i , int j){

		if(i<0 || i>=gold.length || j>=gold[0].length){
			return 0 ;
		}

		int right = goldMine(gold , i , j+1);
		int rightUp = goldMine(gold , i-1 , j+1);
		int rightDown = goldMine(gold , i+1 , j+1);

		return gold[i][j] + Math.max(right , Math.max(rightUp , rightDown));
	}
}