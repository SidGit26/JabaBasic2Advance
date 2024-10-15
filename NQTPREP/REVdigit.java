package NQTPREP;

public class REVdigit {
    public static void main(String[] args) {
        int num = 56789;
        int revnumber=0;
        while(num!=0){
            int digit = num % 10;
            revnumber = revnumber*10 + digit;
            num /=10;
        }
        System.out.println("Reversed Number: " + revnumber);
    }
    
}
