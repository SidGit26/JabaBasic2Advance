package NQTPREP;

public class StringPalindrome {
    public static void main(String[] args) {
        // String s ="MASAM";
        // System.out.println(palindrome(0, s));
        String testStr = "A man, a plan, a canal: Panama";
        if (isPalindrome(testStr)) {
            System.out.println("\"" + testStr + "\" is a palindrome.");
        } else {
            System.out.println("\"" + testStr + "\" is not a palindrome.");
        }
    }

        
    }
   static boolean palindrome(int i ,String s){
        //base condtion
        if(i>=s.length()/2) return true;

        //if start is not equal to end , not palindrome

        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;

        //if both the charters are same check start+1 and end-1
        return palindrome(i+1,s);

    }
    
}


