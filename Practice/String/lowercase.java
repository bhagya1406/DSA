import java.util.Scanner;

public class lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String s = sc.next();
        sc.close();
        lowecase(s);
    }

    public static void lowecase(String s){
        StringBuilder sb = new StringBuilder(s);
        String s1  = sb.toString();
        System.out.println(s1.toLowerCase());
    }
}
