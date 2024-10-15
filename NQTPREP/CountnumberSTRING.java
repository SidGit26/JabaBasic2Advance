package NQTPREP;

public class CountnumberSTRING {
    public static void main(String[] args) {
        String str = " I am good Boy";
        int n = str.length();
        int spaces = 0;

        for(int i = 0; i<n;i++){
            if(str.charAt(i) == ' ')
                spaces = spaces + 1;
        }
        System.out.println("Number of words are " );
        System.out.println(spaces+1);
    }
    
}
