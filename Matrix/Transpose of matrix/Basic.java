public class Basic{
    public static void main(String[] args) {
        int[][]mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][]result = matrix(mat);
        for(int i=0;i<mat.length;i++){
            for(int j =0;j<mat[0].length;j++){
                System.out.print(result[i][j]+ " ");
            }
        }
    }

    public static int[][] matrix(int[][]mat){
        for(int i =0;i<mat.length;i++){
            for(int j=i;j<mat[0].length;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;
    }
}