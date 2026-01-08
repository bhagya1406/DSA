import java.util.*;

public class p9{
	public static void main(String[]args){
		// int[]arr={2,3,7,5,10};
		int[]arr ={1,1,2,4,8,16};
		ArrayList<Integer>ans=Score(arr);
		System.out.print(ans);
	}

	public static ArrayList<Integer> Score(int[]arr){
		ArrayList<Integer>al = new ArrayList<>();
		int result = 0;
		for(int i =0;i<arr.length;i++){
			result+= (arr[i]*2);
			al.add(result);
		}
		return al;
	}
}