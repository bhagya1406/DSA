public class Demo {
    public static void main(String[] args) {
        int[]arr={1,0,2,3,0,4,0,1};
        // int[] arr = {1,2,0,1,0,4,0};
        int[]result=MoveZeros(arr);
        for(int i = 0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }

    public static int[] MoveZeros(int[]arr){
        int j =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        for(int i =j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        return arr;
    }
    
}

// o/p:- 1 2 1 4 0 0 0 
