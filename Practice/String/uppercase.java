import java.util.Scanner;

public class uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String s = sc.next();
        sc.close();
        upperCase(s);
    }

    public static void upperCase(String s){
        StringBuilder sb = new StringBuilder(s);
        String s1  = sb.toString();
        System.out.println(s1.toUpperCase());
    }
}

