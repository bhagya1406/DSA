public class Basic{
    public static void main(String[]args){
        int[]arr={1,2,3,4,5};
        RotateLeft(arr);
        } 


    public static void  RotateLeft(int[]arr){
        int[]temp = new int [arr.length];
        for(int i=0;i<temp.length-1;i++){
            temp[i]=arr[i+1];
        }
        temp[temp.length-1]=arr[0];
        for(int j =0;j<temp.length;j++){
        System.out.print(temp[j] + " "); 
        }
    }
}

// o/p:- 2 3 4 5 1