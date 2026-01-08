// frequency of a character present in a string

import java.util.HashMap;
import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("enter a string");
        sc.close();
        charFrequency(s);
    }

    public static void charFrequency(String s){
        HashMap <Character , Integer> hm = new HashMap<>();
            for(int i =0; i<s.length();i++){
                char ch = s.charAt(i);
                hm.put(ch, hm.getOrDefault(ch, 0)+1);
            }
            for(char key : hm.keySet()){
                System.out.println(key + " " +hm.get(key));
            }
        }
}
