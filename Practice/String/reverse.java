// reverse a string

public class reverse {
    public static void main(String[] args) {
    //     String s = "abc";
    //     String s1 = "";
    //     for(int i = s.length()-1 ; i>=0 ; i--){
    //         s1+=s.charAt(i);
    //     }
    //     System.out.println(s1);

// using method
    StringBuilder sb = new StringBuilder("abc");
    System.out.println(sb.reverse());   
    }
}
