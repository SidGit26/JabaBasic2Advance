package NQTPREP;
public class ReverseWordsWithForLoop {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the original string
        String originalString = "I LOVE MY INDIA";

        // Step 2: Split the original string into an array of words
        String[] words = originalString.split(" ");

        // Step 3: Create a String to store the result
        String reversedString = "";

        // Step 4: Loop through each word in the array
        for (int i = 0; i < words.length; i++) {
            String word = words[i];  // Get each word from the array
            String reversedWord = "";  // String to store the reversed word

            // Step 5: Reverse each word using a nested for loop
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);  // Append characters in reverse order
            }

            // Step 6: Add the reversed word to the result string with a space
            reversedString += reversedWord + " ";
        }

        // Step 7: Print the result after trimming the trailing space
        System.out.println("Reversed words: " + reversedString.trim());
    }
}
