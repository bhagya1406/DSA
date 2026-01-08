//check strings are anagram or not

import java.util.HashMap;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter 1st string : ");
        String s = sc.next();
         System.out.println("enter 2nd string : ");
        String s1 = sc.next();
        sc.close();
        boolean ans = isAnagram(s , s1);
        System.out.println(ans);
    }

    // public static boolean isAnagram(String s , String s1){
    //     if(s.length() != s1.length()){
    //         return false;
    //     }

    //     HashMap<Character , Integer> hm = new HashMap<>();
    //     for(int i =0;i<s.length();i++){
    //         char ch = s.charAt(i);
    //         hm.put(ch, hm.getOrDefault(ch, 0)+1);
    //     }

    //     HashMap<Character , Integer> hm1 = new HashMap<>();
    //     for(int i =0;i<s1.length();i++){
    //         char ch1 = s1.charAt(i);
    //         hm1.put(ch1, hm1.getOrDefault(ch1, 0)+1);
    //     }

    //     if(hm.equals(hm1)){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }

        public static boolean isAnagram(String s , String s1){
            if(s.length() != s1.length()){
                return false;
            }

            HashMap<Character , Integer> hm = new HashMap<>();
            for(int i =0;i<s.length();i++){
                char ch = s.charAt(i);
                hm.put(ch, hm.getOrDefault(ch, 0)+1);
            }

            for(int i =0;i<s1.length();i++){
                char ch1 = s1.charAt(i);
                hm.put(ch1 , hm.getOrDefault(ch1, 0)-1);
                if(hm.get(ch1) == 0){
                    hm.remove(ch1);
                }
            }
            return hm.isEmpty();
        }
    }