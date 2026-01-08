import java.util.*;
public class p1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[]arr = new int[size];
		for(i=0 ; i<size ; i++){
			arr[i] = sc.nextInt();
		}

	HashMap<Integer , Integer> hm = countFerquency(arr);
	System.out.println(hm.getKey() + " ; " + hm.getValue());
	Sc.close();
	}

	public static HashMap<Integer , Integer> countFrequencies(int[]arr){
		HashMap<Integer , Integer> hm = new HashMap<>();
		for(int elememt : arr){
			hm.put(element , hm.getOrDefault(elemet , o)+1);
		}
		return hm;
	}
}
		