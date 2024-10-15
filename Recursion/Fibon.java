package Recursion;

public class Fibon {
    public static void main(String[] args) {
        System.out.println(fibo(6));
        
    }
    static int fibo(int n){
        //base condition
        if(n<2){
            return n; //return 1 = 1,1, (0 excluded) //instead of starting with 0, 1, your sequence will start with 1, 1. This may not be the standard Fibonacci sequence anymore but rather a shifted version where the first number becomes 1.


        }

        return fibo(n-1) + fibo(n-2);

    }
    
}
