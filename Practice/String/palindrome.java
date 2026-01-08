// check string is palindrome or not

// (i)1st way
public class palindrome {
    // public static void main(String[] args) {
    //     String s = "abcdcba";
    //     String s1 = "";
    //     for(int i=s.length()-1;i>=0;i--){
    //         s1+= s.charAt(i);
    //     }
    //     if(s.equals(s1)){
    //         System.out.println("true");
    //     }
    //     else{
    //         System.out.println("false");
    //     }
    // }

// (ii)2nd way
    public static void main(String[] args) {
        String s = "madam";
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else{
                System.out.println("false");
            }
        }
        System.out.println("true");
    }
}
