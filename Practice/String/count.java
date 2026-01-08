// count a vowel
public class count {
    public static void main(String[]args){
        String s = "abcdefg";
        // int Count = 0;
        // for(int i = 0 ; i<s.length() ; i++){
        //     char ch = s.charAt(i);
        //     if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        //         Count++;
        //     }
        // }
        //  System.out.println(Count);
        System.out.println(vowels(s));
    }

    public static int vowels(String s){
        int count = 0;
        for(int i = 0 ; i <s.length() ; i++){
            if("aeiou".indexOf(s.charAt(i)) != -1){
                count++;
            }
        }
        return count;
    }
}
