import java.util.Scanner;

public class p1 {

    // // Print array elements
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i = 0 ; i<n;i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     for(int j = 0 ; j<n;j++){
    //         System.out.println(arr[j] + " ");
    //     }
    //     sc.close();
    // }

    // // Find length of array
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     System.out.println(arr.length);
    //     sc.close();
    // }

    // // Access first and last element
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     System.out.println(arr[0]);
    //     System.out.println(arr[arr.length - 1]);
    //     sc.close();
    // }

    // // Sum of firest and last element
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i = 0 ; i<n ; i++){
//             arr[i] = sc.nextInt();
//         }
//         int sum = arr[0] + arr[arr.length - 1];
//         System.out.println(sum);
//         sc.close();
//     }

    // // Print array in reverse order
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i = 0 ; i<n ; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int j = n-1 ; j>=0 ; j--){
//             System.out.println(arr[j]);
//         }
//         sc.close();
//     }

   // Count elements greater than 5
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int arr[] = new int[n];
    // int count = 0;
    // for(int i = 0 ; i<n ; i++){
    //     arr[i] = sc.nextInt();
    //     if(arr[i] > 5){
    //         count++;
    //     }
    // }
    // sc.close();
    // System.out.println(count);
    // }

    // // Count elements smaller than 10
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     int count = 0;
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //         if(arr[i] < 10){
    //             count++;
    //         }
    //     }
    //     sc.close();
    //     System.out.println(count);
    // }

    // // Add all elements
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     int sum = 0 ;
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //         sum = sum + arr[i];
    //     }
    //     sc.close();
    //     System.out.println(sum);
    // }

    // // Multiply all elements
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     int mul = 1 ;
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //         mul = mul * arr[i];
    //     }
    //     sc.close();
    //     System.out.println(mul);
    // }

    // // Check if array contain 5
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     sc.close();
    //     boolean found = false;
    //     for(int j = 0 ; j<n ; j++){
    //         if(arr[j] == 5){
    //             found = true;
    //         }
    //     }
    //     System.out.println(found);
    // }

    // //Find largest index
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     sc.close();
    //     int num = arr[0];
    //     int maxIndex = 0;
    //     for(int j = 1 ;j<n;j++){
    //         if(arr[j] > num){
    //             num = arr[j];
    //             maxIndex = j;
    //         }
    //     }
    //     System.out.println(maxIndex);
    // }

    // //Check if array is empty or not
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     sc.close();
    //     if(n == 0){
    //         System.out.println("true");
    //     }
    //     else{
    //         System.out.println("false");
    //     }
    // }

    // // Replace first element with 100
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     sc.close();
    //     for(int j = 0 ; j<n ; j++){
    //         arr[0] = 100;
    //         System.out.print(arr[j] + " ");
    //     }
    // }

    // // Replace last eleemnt with 100
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     sc.close();
    //     for(int j = 0 ; j<n ; j++){
    //         arr[n-1] = 100;
    //         System.out.print(arr[j] + " ");
    //     }
    // }

    // // Count even and odd numbers
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     sc.close();
    //     int evenNum = 0;
    //     int oddNum = 0;
    //     for(int j = 0 ; j<n ; j++){
    //         if(arr[j] % 2 == 0){
    //             evenNum++;
    //         }
    //         else{
    //             oddNum++;
    //         }
    //     }
    //     System.out.println(evenNum);
    //     System.out.println(oddNum);
    // }

    // // Double each element
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     sc.close();
    //     for(int j = 0 ; j<n ; j++){
    //         System.out.print(arr[j] * 2);
    //     }
    // }

    // // Substract 1 from each element
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     sc.close();
    //     for(int j = 0 ; j<n ; j++){
    //         System.out.print(arr[j] - 1 + ",");
    //     }
    // }

    // //Check if all elements equal
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     sc.close();
    //     boolean allEquals = true;
    //     for(int j = 0 ; j<n-1 ; j++){
    //         if(arr[j] != arr[0]){
    //             allEquals = false;
    //         break;
    //         }
    //     }
    //     System.out.println(allEquals);
    // }

    // //Find middle element
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i = 0 ; i<n ; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     sc.close();
    //     if(n%2 == 1){
    //         int mid = n/2;
    //         System.out.println(arr[mid]);
    //     }
    //     else{
    //         int mid1 = n/2 - 1;
    //         int mid2 = n/2;
    //         System.out.println(arr[mid1] + " " + arr[mid2]);
    //     }
    // }
}
