// remove extra space 
public class space {
    public static void main(String[] args) {
        String s = "the sky  is  blue";
        String ans = removeSpace(s);
        System.out.println(ans); 
    }

    public static String removeSpace(String s){
        String [] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<words.length ; i++){
            sb.append(words[i]);
            if(i != words.length-1){
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    } 
}
