public class Basic{
    public static void main(String[] args) {
        // int[][]mat = { {1,1,1} , {1,0,1} , {1,1,1,}};
        int[][]mat = { {1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16} };
         matrix(mat);
        // for(int i=0;i<result.length;i++){
        //     for(int j=0;j<result[0].length;j++){
        //     System.out.print(result[i][j] + " ");
        //     }
        // }
    }

        public static void matrix(int[][]mat){
            int total = mat.length*mat[0].length;
            int sr = 0;
            int er = mat.length-1;
            int sc = 0;
            int ec = mat[0].length-1;
            int dir = -1;
            while(total!=0){
                dir = (dir+1)%4;

                if(dir==0){
                    for(int j = sc ; j<=ec;j++){
                        System.out.print(mat[sr][j] + ", ");
                        total--;
                    }
                    sr++;
                }
                else if(dir==1){
                    for(int i= sr;i<=er;i++){
                        System.out.print(mat[i][ec]  + ", ");
                        total--;
                    }
                    ec--;
                }
                else if(dir==2){
                    for(int j =ec;j>=sc;j--){
                        System.out.print(mat[er][j] + ", ");
                        total--;
                    }
                    er--;
                }
                else{
                    for(int i=er;i>=sr;i--){
                        System.out.print(mat[i][sc] + ", ");
                        total--;
                    }
                    sc++;
                }
            }
        } 
    }