// remove characters from one string present in another string

import java.util.HashMap;
import java.util.HashSet;

public class remove {
    public static void main(String[] args) {
        String s = "computer";
        String s1 = "cat";
        String ans = removeCharacter(s, s1);
        System.out.println(ans);
    }

    public static String removeCharacter(String s , String s1){

        // //using HashMap
        // HashMap<Character , Integer> hm = new HashMap<>();
        // for(int i=0;i<s1.length();i++){
        //     char ch = s1.charAt(i);
        //     hm.put(ch, hm.getOrDefault(ch, 0)+1);
        // }

        // StringBuilder sb = new StringBuilder();
    
        // for(int j =0;j<s.length();j++){
        //     char ch1 = s.charAt(j);
        
        //     if (!hm.containsKey(ch1)){
        //         sb.append(ch1);
        //     }
        // }

        // return sb.toString();

        // using HashSet
        HashSet<Character> hs = new HashSet<>();
        for(int i =0; i<s1.length() ; i++){
            char ch = s1.charAt(i);
            hs.add(ch);
        }
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j<s.length() ; j++){
                char ch1 = s.charAt(j);
                if(!hs.contains(ch1)){
                    sb.append(ch1);
                }
            }
        return sb.toString();
    }
}