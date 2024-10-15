package NQTPREP;

public class Removespace {

    public static void main(String[] args) {
        // Convert the input string "Take you forward " to a character array
        char[] atr = "Take you forward ".toCharArray();
        
        // Call the removespace method, which will modify the character array in-place 
        // and return the number of characters after removing spaces.
        int count = removespace(atr);
        
        // Print the modified character array as a string up to the 'count' position
        // The result is a string with spaces removed
        System.out.println(String.valueOf(atr).subSequence(0, count));
    }

    // Method to remove spaces from the character array
    static int removespace(char[] atr) {
        int count = 0;  // This will count the non-space characters

        // Loop through the character array
        for (int i = 0; i < atr.length; i++) {
            // Check if the current character is NOT a space
            if (atr[i] != ' ') {
                // If it's not a space, overwrite the character at the 'count' position
                // with the current character, effectively shifting non-space characters
                atr[count] = atr[i];

                // Increment the count (indicates the position where the next non-space 
                // character should go)
                count++;
            }
        }

        // Return the count of non-space characters
        return count;
    }
}
