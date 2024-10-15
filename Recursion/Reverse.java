package Recursion;

public class Reverse {
    public static void main(String[] args) {
        rev1(1234);
    }

    static int sum = 0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int  rem = n/10;
        sum = sum * 10 + rem;
        rev1(n/10);
        System.out.println(sum);


    }
    static void rev2(int n){
        //sometime syou might not need additiona variable create a help fun
         
    }
    
}
