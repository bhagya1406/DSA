public class Duplicates {
    public static void main(String[] args) {
        int[]arr={1,1,2,2,2,2,3,3};
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        int[]result = removeDuplicates(arr,max);
        for(int j = 0;j<result.length;j++){
            System.out.print(result[j]+" ");
        }
    }

    public static int[] removeDuplicates(int[]arr, int max){
        int freq[] = new int [max+1];
        for(int i=0;i<arr.length;i++){
            int frequency = arr[i];
            freq[frequency]++;
        }

        int[] result= new int [max];
        int ind = 0;
        for (int k =0; k<=max;k++){
            if(freq[k]>0){
                result[ind++]=k;
            }
        }
        return result;
    }
}
