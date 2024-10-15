package NQTPREP;

public class Palindrome {
    public static void main(String[] args) {
    int  number= 45677654;
    boolean isPalindrome = checkPalindrome(number);
    if(isPalindrome){
        System.out.println(number + " is a palindrome.");

    }else{
        System.out.println(number + " is not a  palindrome.");

    }
     
    }
    static boolean checkPalindrome(int number){
        int originalnumber = number; //store the orignal number
        int reversenumber = 0;

        //Reverse the number

        while(number !=0){
            int lastDigit = number % 10;
            reversenumber = reversenumber * 10 + lastDigit;
            number = number / 10;
        }

        return originalnumber == reversenumber;
    }

    
}
