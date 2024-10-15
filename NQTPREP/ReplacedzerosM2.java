package NQTPREP;
public class ReplacedzerosM2 {
    static int replaceZerosWithOnes(int num) {
        if (num == 0) {
            return 1;  // Handle case when the input number itself is 0
        }
        
        int result = 0;
        int placeValue = 1;  // Used to track the digit place (ones, tens, hundreds, etc.)
        
        // Process each digit of the number
        while (num > 0) {
            int digit = num % 10;  // Get the last digit
            
            // Replace 0 with 1
            if (digit == 0) {
                digit = 1;
            }
            
            // Add the modified digit to the result
            result += digit * placeValue;
            
            // Move to the next digit
            num /= 10;
            placeValue *= 10;  // Increase the place value (ones -> tens -> hundreds, etc.)
        }
        
        return result;
    }

    public static void main(String[] args) {
        int n = 100204;
        int result = replaceZerosWithOnes(n);
        System.out.println("After replacing zeros with ones, " + n + " becomes " + result);
    }
}
