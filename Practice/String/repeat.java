// find the first repeated character

import java.util.HashMap;
import java.util.HashSet;

public class repeat {
    public static void main(String[] args) {
        String s = "banana";
        Character ans = repeatedCharacter(s);
        System.out.println(ans);
    }

    public static Character repeatedCharacter(String s){
        // //using hashmap
        // HashMap<Character , Integer> hm = new HashMap<>();
        // for(int i = 0 ; i<s.length();i++){
        //     char ch = s.charAt(i);
        //     hm.put(ch, hm.getOrDefault(ch, 0)+1);
        //     if(hm.get(ch)>1){
        //         return ch;
        //     }
        // } 
        // return 0;

        //using hashset
        HashSet<Character> hs = new HashSet<>();
        for(int i =0 ; i<s.length();i++){
            if(hs.contains(s.charAt(i))){
                return s.charAt(i);
            }
            hs.add(s.charAt(i));
        }
        return 0 ;
    }
}

