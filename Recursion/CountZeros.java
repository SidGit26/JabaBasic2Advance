
    //chat gpt link https://chatgpt.com/share/670964f5-66c4-8006-8b6e-1d1f4e7ae9cb
    package Recursion;

    public class CountZeros {
        public static void main(String[] args) {
            // Calling the count function with the number 302014 to count the zeros
            System.out.println(count(302014));
        }
    
        // Wrapper function to initiate the recursive process
        static int count(int n) {
            // Calls the helper function with the initial count of zeros set to 0
            return helper(n, 0);
        }
    
        // Recursive helper function that counts zeros in the number n
        private static int helper(int n, int c) {
            // Base case: if n becomes 0, return the current count c
            if (n == 0) {
                return c;
            }
    
            // Get the last digit of the number
            int rem = n % 10;
    
            // If the last digit is 0, increment the count and call the function recursively
            if (rem == 0) {
                return helper(n / 10, c + 1); // Remove the last digit and increase the count
            }
    
            // If the last digit is not 0, just proceed with removing the last digit, keeping the count same
            return helper(n / 10, c);
        }
    }
    