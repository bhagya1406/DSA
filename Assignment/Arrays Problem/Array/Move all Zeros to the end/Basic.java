public class Basic{
    public static void main(String[] args) {
        // int[]arr={1,0,2,3,0,4,0,1};
        int[] arr = {1,2,0,1,0,4,0};
        int[]result=MoveZeros(arr);
        for(int i = 0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }

    public static int[] MoveZeros(int[]arr){
        int [] temp = new int[arr.length];
        int index =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[index] = arr[i];
                index++;
            }
        }
        return temp;
    }
}

// o/p:- 1 2 3 4 1 0 0 0 
// o/p:- 1 2 1 4 0 0 0 