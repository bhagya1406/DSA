// (i)vowel + consonent count
// (ii)vowel + consonent count using indexof
// (iii)count a digits

// (i)
public class count1 {
    public static void main(String[]args){
        String s = "abcdefg";
        int vowelCount = 0;
        int consonentCount = 0;
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowelCount++;
            }
            else{
                consonentCount++;
            }
        }
         System.out.println("vowel count is : " + vowelCount);
         System.out.println("consonent count is : " + consonentCount);
    }   
}

// (ii)
// vowels + consonent count using indexof
//     public static void main(String[]args){
//         String s = "abcdefgh";
//         int vowels = 0;
//         int consonent = 0;
//         for(int i = 0; i<s.length();i++){
//             char ch = s.charAt(i);
//             if("aeiou".indexOf(ch)!= -1){
//                 vowels++;
//             }
//             else{
//                 consonent++;
//             }
//         }
//         System.out.println("vowels is : " + vowels);
//         System.out.println("consonent is : " + consonent);
//     }
// }

// (iii)
// count a digits in a string
// public static void main(String[]args){
//     String s = "abcd123dgh6789";
//     int digits = 0;
//     for(int i =0; i<s.length();i++){
//         char ch = s.charAt(i);
//         if(ch-'0'>=0 && ch-'0'<=9){
//             digits++;
//         }
//     }
//     System.out.println(digits);
// }
// }    

