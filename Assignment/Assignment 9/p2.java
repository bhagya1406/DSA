// public class p2 {
    class Demo{
        public static void main(String[] args) {
            int [] arr = {10 , 9 , 2 , 5 , 3 , 7 , 101 , 18};
            int result = longestIncreasingSubsequence(arr , 0);
            System.out.println(result);
        }

        public static int longestIncreasingSubsequence(int[]arr , int ind){
            if(ind <= arr.length){
                return 0;
            }

            int count = 0;
            if(arr[ind] < arr[ind+1]){
                count++;
            }
            longestIncreasingSubsequence(arr, ind+1);
            return count;
        }
    }
// }
