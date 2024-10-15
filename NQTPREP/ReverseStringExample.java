package NQTPREP;
public class ReverseString {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the original string
        String originalString = "Hello, World!"; // This is the string we want to reverse
       // //String originalStringg = "Hello, World!";
        // Step 2: Create a StringBuilder object using the original string
        // StringBuilder is a mutable sequence of characters. It's more efficient than String for operations like reversing.
        StringBuilder sb = new StringBuilder(originalString);

        // Step 3: Reverse the string using the reverse() method of StringBuilder
        // The reverse() method reverses the sequence of characters in the StringBuilder object.
        // toString() converts the reversed sequence back into a String object.
        String reversedString = sb.reverse().toString();

        // Step 4: Print the reversed string
        System.out.println("Reversed String: " + reversedString); // Output the reversed string to the console


        // for (int i = originalStringg.length() -1 ;i>=0; i--){
        //     reversedStringg += orignalStringg.charAt(i);
        // }
        // System.out.println(+revreversedStringg);
    }
}


//
//  public class ReverseStringExample {
//     public static void main(String[] args) {
//         String original = "Hello, World!";
//         String reversed = reverseString(original);
//         System.out.println("Original String: " + original);
//         System.out.println("Reversed String: " + reversed);
//     }

//     // Method to reverse a string
//     static String reverseString(String str) {
//         // Create an empty string to store the reversed result
//         String reversed = "";
        
//         // Iterate through the string from the last character to the first
//         for (int i = str.length() - 1; i >= 0; i--) {
//             // Append each character to the result
//             reversed += str.charAt(i);
//         }
        
//         return reversed;
//     }
// }
// 