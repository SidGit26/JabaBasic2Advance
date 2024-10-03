package Stringcheck;
import java.util.ArrayList;
public class Preety {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        float a= 453.12345f;
       System.out.printf("Fie is %.3f", Math.PI);
       System.out.println();
        System.out.printf("Formatted number is %.2f", a);
    
        //Place Holders
        System.out.printf("helli %s: and I am %s", "kunal" , "insaan");
        System.out.println("Kunal" + new ArrayList<>());
        // not able to print System.out.println(new Integer(56) + new ArrayList<>());
        System.out.println(new Integer(56) + " " + new ArrayList<>()); //atleat on of the string
        



    }
    
}
