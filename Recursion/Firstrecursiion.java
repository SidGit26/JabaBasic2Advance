package Recursion;

public class Firstrecursiion {
    public static void main(String[] args) {
        message(1);
        
    }

    static void message(int n){
        if(n==10){
            System.out.println(10);
            return; 
        }
        System.out.println(n);
        
        //recursive call
        //if yu are calling a function again and again, you can treat it as a seprate call in the stack
        
        message(n+1);
    }
    
}
