public class Basic{
    public static void main(String[] args) {
        // int[][]mat = { {1,1,1} , {1,0,1} , {1,1,1,}};
        int[][]mat = { {0,1,2,0} , {3,4,5,2} , {1,3,1,5} };
        int[][] result = matrix(mat);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
            System.out.print(result[i][j] + " ");
            // System.out.println( );
            }
        }
    }

    public static int[][] matrix(int[][]mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    for(int k=0;k<mat.length;k++){
                        if(mat[i][k]!=0){
                        mat[i][k]=-1;
                        }
                    }
                    for(int k=0;k<mat.length;k++){
                        if(mat[k][j]!=0){
                            mat[k][j]=-1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==-1){
                    mat[i][j]=0;
                }
            }
        }
        return mat;
    }
}