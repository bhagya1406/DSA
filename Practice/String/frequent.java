// find the most frequent character

import java.util.HashMap;

public class frequent {
    public static void main(String[] args) {
        String s = "banana";
        Character ans = mostFrequent(s);
        System.out.println(ans);
    }

    public static Character mostFrequent(String s){

        // using hashmap
        // HashMap<Character , Integer> hm = new HashMap<>();
        // for(int i = 0 ; i<s.length();i++){
        //     hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        // }

        // int maxFreq = 0;
        // Character freqChar = null;
        // for (Character key : hm.keySet()) {
        //     int freq = hm.get(key);
        //     if (maxFreq < freq) {
        //         maxFreq = freq;
        //         freqChar= key;
        //     }
        // }
        // return freqChar;


        // //freq[s.charAt(i)-'a']
        int[] freq = new int[26];
        for(int i = 0 ;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                freq[s.charAt(i) - 'a']++;
            }
        }

            int maxFreq = 0;
            int index = -1;
            for(int j = 0 ; j<26 ; j++){
                if(maxFreq < freq[j]){
                maxFreq = freq[j];
                index = j;
            }
        } 
        return(char) (index+'a');
    }
}
