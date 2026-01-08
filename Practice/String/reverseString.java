// reverse a word present in a statement

public class reverseString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String ans = reverse(s);
        System.out.println(ans);
    }

    // public static String reverse(String s){
    //     String word = "";
    //     String ans = "";
    //     for(int i = 0; i<s.length();i++){
    //         char ch = s.charAt(i);
    //         if(ch == ' '){
    //             ans+= word + " " ;
    //             word= "" ;
    //         }
    //         else{
    //             word = ch + word;
    //         }
    //     }
    //     ans+=word;
    //     return ans;
    // }

    public static String reverse(String s){
        String[]words = s.split(" "); //['the' , 'sky' , 'is' , 'blue']
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<words.length ; i++){
            sb.append(new StringBuilder(words[i]).reverse());
            sb.append(" ");
        
        }
            return sb.toString().trim();
    }
}
