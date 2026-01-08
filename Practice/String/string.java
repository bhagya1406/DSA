import java.util.HashMap;

public class string{
	public static void main(String[]args){
		String s = "abcdefg";
		// System.out.println(vowels(s));
		// System.out.println(consonents(s));

		String s1 = "abcd123efg456hji789";
		// System.out.println(digits(s1));

		String s2 = "abcdcba";
		// System.out.println(palindrome(s2));

		String s3 = "bat";
		// System.out.println(reverse(s3));
		
		String s4 = "ABHefGh";
		// System.out.println(lowercase(s4));
		// System.out.println(uppercase(s4));

		String s5 = "Apple";
		// count1(s5);

		String s6 = "apple";
		String s7 = "paple";
		// System.out.println(anagram(s6, s7));
		
		}

	// 1. COUNT A VOWELS	
	public static int vowels(String s){
		int count = 0;
		for(int i = 0 ; i<s.length() ; i++){
			if("aeiou".indexOf(s.charAt(i)) != -1){
				count++;
			}
		}
		return count;
	}

	// 2. COUNT A CONSONENTS
	public static int consonents(String s){
		int vowels = 0 ;
		int consonents = 0;
		for(int i = 0 ; i<s.length();i++){
			if("aeiou".indexOf(s.charAt(i)) != -1){
				vowels++;
			}
			else{
				consonents++;
			}
		}
		return consonents;
	}

	// 3. COUNT A DIGITS
	public static int digits(String s){
		int num = 0;
		for(int i = 0 ; i<s.length() ; i++){
			if("0123456789".indexOf(s.charAt(i)) != -1){
				num++;
			}
		}
		return num;
	}

	// 4. CHECK THE STRINGS ARE PALINDROME
	public static boolean palindrome(String s2){
		String rev = "";
		for(int i = s2.length()-1 ; i>=0 ; i--){
			rev += s2.charAt(i);
		}
		if(s2.equals(rev)){
			return true;
		}
		return false;
	}

	// 5. REVERSE A STRING 
	public static String reverse(String s3){
		StringBuilder sb = new StringBuilder(s3);
		sb.reverse();
		return sb.toString();
	}

	// 6. LOWERCASE
	public static String lowercase(String s4){
		StringBuilder sb = new StringBuilder(s4);
		sb.toString();
		return s4.toLowerCase();
	}

	// 7. UPPPERCASE
	public static String uppercase(String s4){
		StringBuilder sb = new StringBuilder(s4);
		sb.toString();
		return s4.toUpperCase();
	}

	// 8. count character frequency
	public static void count1(String s5){
		HashMap<Character , Integer> hm = new HashMap<>();
		for(int i = 0 ; i<s5.length() ; i++){
			hm.put(s5.charAt(i), hm.getOrDefault(s5.charAt(i), 0)+1);
		}
		for (char ch : hm.keySet()) {
			System.out.println(ch + " " +hm.get(ch));
		}
	}

	// 9. CHECK TWO STRINGS ARE ANAGRAM OR NOT
	public static boolean anagram(String s6 , String s7){
		HashMap<Character , Integer> hm = new HashMap<>();

		for(int i = 0 ; i<s6.length() ; i++){
			hm.put(s6.charAt(i), hm.getOrDefault(s6.charAt(i), 0)+1);
		}

		for(int j = 0 ; j<s7.length() ; j++){
			hm.put(s7.charAt(j), hm.getOrDefault(s7.charAt(j), 0)-1);
			if(hm.get(s7.charAt(j)) == 0){
				hm.remove(s7.charAt(j));
			}
		}
		return hm.isEmpty();
	}
}
