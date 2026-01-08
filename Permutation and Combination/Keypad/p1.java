import java.util.*;

public class p1{
	public static void main(String[]args){
		String str = "23";
		String[]arr = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
		keypadCombination(str , arr , 0 ,StringBuilder());
	}

	public static void keypadCombination(String str , String[]arr , int ind , StringBuilder sb){
		if(ind == str.length()){
			System.out.println(sb.toString());
			return;
		}

		String str1 = arr[str.charAt(ind) - '0'];
		for(int i = 0 ; i<str1.length() ; i++){
			char ch = str1.charAt(i);
			sb.append(ch);
			keypadCombination(str , arr , ind+1 , sb);
			sb.deleteCharAt(sb.length()-1);
		}
	}
}