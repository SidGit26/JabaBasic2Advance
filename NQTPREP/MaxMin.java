package NQTPREP;

public class MaxMin {
    // Declare mini and maxi as class-level variables
    static int mini = Integer.MAX_VALUE;
    static int maxi = Integer.MIN_VALUE;

    public static void main (String[] args){
        int n = 4726;
        MinMax(n);  // Call the MinMax function
        System.out.println("The minimum digit is: " + mini);
        System.out.println("The maximum digit is: " + maxi);
    }

    static private void MinMax(int n){
        int d;
        // Loop to extract each digit and find min and max
        while(n != 0){
            d = n % 10;  // Extract last digit
            mini = Math.min(mini, d);  // Update minimum digit
            maxi = Math.max(maxi, d);  // Update maximum digit
            n = n / 10;  // Remove the last digit
        }
    }
}
