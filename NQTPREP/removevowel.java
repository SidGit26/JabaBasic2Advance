package NQTPREP;

public class removevowel {
    public static void main(String[] args) {
        String str = "take u forward";
        System.out.println("String after removing the vowels:\n" + removeVowels(str));
    }

    static String removeVowels(String str) {
        StringBuilder result = new StringBuilder(); // Using StringBuilder for efficient string manipulation

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is not a vowel
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                result.append(ch); // Add the character to the result if it's not a vowel
            }
        }

        // Return the final string without vowels
        return result.toString();
    }
}
