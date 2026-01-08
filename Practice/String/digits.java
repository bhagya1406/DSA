// check if string contains only digits

import java.util.HashSet;

public class digits {
    public static void main(String[] args) {
        String s = "a12bc3";
        Boolean ans = digitContains(s);
        System.out.println(ans);
    }

    public static boolean digitContains(String s){
        // HashSet<Character> hs = new HashSet<>();
        // for(int i = 0; i<s.length();i++){
        //     char ch = s.charAt(i);
        //     if(ch>=0 && ch<=9){
        //         return false;
        //     }
        //     else{
        //         hs.add(ch);
        //     }
        // }
        // return hs.isEmpty();

        for(int i = 0; i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    } 
}
