package NQTPREP;

public class Twoispalin {
    public static void main(String[] args) {
        String testStr = "madam 9is9";
        if (isPalindrome(testStr)) {
            System.out.println("\"" + testStr + "\" is a palindrome.");
        } else {
            System.out.println("\"" + testStr + "\" is not a palindrome.");
        }
    }
    
     static boolean isPalindrome(String str){
        str = str.toLowerCase();
    
    
        //intilize two pointers
        int left = 0;
        int right = str.length() -1;
    
        //compare chaarecters
    
        while(left<right){
    
            while (left<right) {
                left++;
                
            }
            while (left<right) {
                right--;
                
            }
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
    
            //otherewsie move the pointers
    
            left++;
            right--;
        }
    
        return true;
    
    
    }
    
    
}
