import java.util.Scanner;

public class Main {

    public static boolean valid(String str, int left, int right) {
        left = 0;
        right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Java code
        String str = "racecar";
        int left = 0;
        int right = str.length() - 1;
        
        boolean ans = valid(str, left, right);
        
        System.out.println(ans);
    }
}
