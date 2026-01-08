public class p2{
	public static void main(String[]args){
		// int[][]mat = {{1,2,3},{4,5,6},{7,8,9}};
		// int[][]mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		int[][]mat = {{5}};
		int ans = DiagonalSum(mat);
		System.out.print(ans);
	}

	public static int DiagonalSum(int[][]mat){
		int sum = 0;
		for(int i =0;i<mat.length;i++){
			for(int j =i;j<mat[0].length;j++){
				if(i == j){
					sum+=mat[i][j];
					sum+=mat[i][mat[0].length-1-i];
				}
			}
		}
		sum-=mat[mat.length/2][mat[0].length/2];
		return sum;
	}
}

	

/* o/p:- 25
	 7
  	 5
*/