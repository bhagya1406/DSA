public class Basic1{
    public static void main(String[]args){
        int [] arr ={3,7,8,9,10,11};
        int k=3;
        int n= arr.length;
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
        reverseArray(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverseArray(int []arr,int start,int end){

        while(start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return;
        
    }
}

//{9,10,11,3,7,8}