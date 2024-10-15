package NQTPREP;

public class Countcv {
    public static void main(String[] args) {
        String str = "Take u forward is Awesome";
        int length = str.length();
        checkcv(str, length);
    }

    static void checkcv(String str, int length) {
        int countv = 0;
        int countc = 0;
        int whitespaces = 0;

        // Convert the string to lowercase for easier comparison
        str = str.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countv++;
            }
            // Check if the character is a consonant (a-z)
            else if (ch >= 'a' && ch <= 'z') {
                countc++;
            }
            // Check if the character is a whitespace
            else if (ch == ' ') {
                whitespaces++;
            }
        }

        // Print the results after the loop finishes
        System.out.println("Vowels: " + countv);
        System.out.println("Consonants: " + countc);
        System.out.println("White spaces: " + whitespaces);
    }
}
