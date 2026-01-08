public class Basic{
    public static void main(String[]args){
        int [] arr = {2,0,2,1,1,0};
        int zeros = 0;
        int once = 0;
        int twos  =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                zeros++;
            }
            else if(arr[i]==1){
                once++;
            }
            else{
                twos++;
            }
        }

        int ind = 0;
        for(int i =0;i<zeros;i++){
            arr[ind++] = 0;
        }
        for(int i =zeros;i<zeros+once;i++){
            arr[ind++] = 1;
        }
        for(int i = zeros+once;i<twos;i++){
            arr[ind++] = 2;
        }

        for(int i =0;i<arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
