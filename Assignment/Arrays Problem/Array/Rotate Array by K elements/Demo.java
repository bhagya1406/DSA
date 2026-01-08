public class Demo{
    public static void main(String[]args){
        int []arr={3,7,8,9,10,11};
        int[] result = rotateLeft(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(result[i] + " ");
        }

    }
    public static int[]rotateLeft(int []arr){
        int k=2;
        int temp1=arr[0];
        int temp2=arr[1];
        
          for(int i=0;i<arr.length-k;i++){
            arr[i]=arr[i+k];
        
          }
          arr[arr.length-2]=temp1;
           arr[arr.length-1]=temp2;
          return arr;
    }
}

//o/p:- 8,9,10,11,3,7