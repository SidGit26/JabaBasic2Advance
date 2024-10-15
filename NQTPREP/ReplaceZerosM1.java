package NQTPREP;

public class ReplaceZerosM1 {
    public static void main(String[] args) {
        int num = 102003;
        System.out.println("Orignal Number:  " + num);

        int newNum = replacezeros(num);
        System.out.println("Numbers after replacing zeros: " +newNum);

        
       

}
static int replacezeros(int num){
    //convert the numbers to a string to manipulate the digits
    String numStr = String.valueOf(num);

    //Replace all occurence of '0' with '1s'
    String replacedStr = numStr.replace('0', '1');

    return Integer.parseInt(replacedStr);
}
    
}
