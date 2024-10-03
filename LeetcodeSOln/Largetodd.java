package LeetcodeSOln;

public class Largetodd {
    public static void main(String[] args) {
        
    }
    class Solution {
    
        // Function to return the largest odd-numbered substring from the input string 'num'
        public String largestOddNumber(String num) {
            
            // Step 1: Extract the last character (digit) of the string and convert it to a string
            String charToString = String.valueOf(num.charAt(num.length() - 1));
            
            // Step 2: Convert the last character from string to integer for comparison
            int stringToInt = Integer.parseInt(charToString);
            
            // Step 3: Check if the last digit is odd
            if (stringToInt % 2 != 0) {
                // If the last digit is odd, return the entire string as the largest odd number
                return num;
            }
    
            // Step 4: Initialize an empty string 'ans' to store the largest odd-numbered substring
            String ans = "";
    
            // Step 5: Iterate over the digits of the number from the last to the first
            for (int i = num.length() - 1; i >= 0; i--) {
                // Convert each character in 'num' to a string and then to an integer
                String string_temp = String.valueOf(num.charAt(i));
                int int_temp = Integer.parseInt(string_temp);
                
                // Step 6: Check if the current digit is even
                if (int_temp % 2 == 0) {
                    // If even, update 'ans' with the substring up to (but excluding) the current digit
                    ans = num.substring(0, i);
                } else {
                    // If an odd digit is found, return the current value of 'ans' immediately
                    return ans;
                }
            }
    
            // Step 7: If no odd digit is found, return the result stored in 'ans'
            return ans;
        }
    }
    
}
