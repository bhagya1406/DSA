// capitalize first letter of every word in a sentence

public class capital {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String ans = capitalFirstLetter(s);
        System.out.println(ans);
    }

    public static String capitalFirstLetter(String s){
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<words.length ; i++){
            sb.append(Character.toUpperCase(words[i].charAt(0)));
            sb.append(words[i].substring(1, words[i].length()));
            sb.append(" ");
        }
           return sb.toString().trim();
    }
}

// except trim we use 
// if(i!=words.length-1){
//     sb.appent(" ");
// }
