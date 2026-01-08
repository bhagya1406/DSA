import java.util.*;

public class p8{
	public static void main(String[]args){
		int[]arr1={1,2,3};
		int[]arr2={2,4,6};
		ArrayList<ArrayList<Integer>> result = Difference(arr1,arr2);
		System.out.println(result);
	}

	public static ArrayList<ArrayList<Integer>> Difference(int[]arr1,int[]arr2){
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();

		for(int i =0;i<arr1.length;i++){
			set1.add(arr1[i]);
		}

		for(int j = 0;j<arr2.length;j++){
			set2.add(arr2[j]);
		}

		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for(int i : set2){
			if(!set1.contains(i)){
				al1.add(i);
			}
		}

		for(int i : set1){
			if(!set2.contains(i)){
				al2.add(i);
			}
		}

		ans.add(al1);
		ans.add(al2);
		return ans;
	}
}

/*o/p:- {{1,3},{4,6}} */