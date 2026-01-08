public class Basic{
    public static void main(String[]args){
        int []arr={3,7,8,9,10,11};
        int k=2;
        int[] result = rotateLeft(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(result[i]);
        }

    }
    public static int[]rotateLeft(int []arr,int k){
        int n = arr.length;
        k= k % n;
        
        int[]temp=new int[arr.length];
          for(int i=k;i< n;i++){
            temp[i-k]=arr[i];
         
          }

          for(int j=0;j<k;j++){
            temp[n-k+j]=arr[j];
          }
          return temp;
    }
}

//o/p:- 3,9,10,11,3,7