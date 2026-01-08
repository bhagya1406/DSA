// count number of words in a sentense

public class count2 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        int ans = countWords(s);
        System.out.println(ans);
    }

    public static int countWords(String s){

        // using slpit method
        // String[] words = s.split(" ");
        // return words.length;

        int count = 0;
        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        return count+1;
    }
}
