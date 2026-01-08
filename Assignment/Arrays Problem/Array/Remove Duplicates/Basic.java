public class Basic {
    public static void main(String[] args) {
        int[]arr={1,1,2,2,2,3,3};
        int[] result = removeDuplicates(arr);
        for(int i=1;i<result.length;i++)
            System.out.print(result[i] + " ");
        }
    
    public static int[] removeDuplicates(int[]arr){
        int i = arr[0];
        for(int j = 1;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    i++;
                    arr[i]=arr[j];
                }
            }
            return arr;
        }
    }
// o/p:- 1 2 3 2 3 3 