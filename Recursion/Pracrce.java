package Recursion;


public class Pracrce {
    public static void main(String[] args) {
       // funrevboth(5);
       //fact(5); //int varibale is use not void
    //    int ans = fact(5);
    //    System.out.println("Ans is of fact 5   :" +ans);
    int ans = sum(5);
       System.out.println("Ans is of fact 5:  " +ans);
    }
    // static void fun(int n){
    //     if(n==0){
    //         return;

    //     }
    //     System.out.println(n);
    //     fun(n-1);
        
    // }
    // static void funrev(int n){
    //     if(n==0){
    //         return;

    //     }
    //     funrev(n-1);
    //     System.out.println(n);
    // }
    // static void funrevboth(int n){
    //     if(n==0){
    //         return;

    //     }
    //     System.out.println(n);
    //     funrevboth(n-1);
    //     System.out.println(n);
    // }
    // static int fact(int n){
    //     if(n<=1){
    //         return 1;
        
    //     }
    //     return n * fact(n-1);

    // }
    static int sum(int n){
        if(n<=1){
            return 1;
        
        }
        return n + sum(n-1);

    }
}
// Explanation of Current Functionality:
// Base Case (if(n == 0)): The recursion terminates when n becomes 0, ensuring the function doesn't run indefinitely.
// Recursive Call (funrev(n - 1)): Before printing, the function recursively calls itself with n - 1, leading to all smaller numbers being printed first.
// Print Statement (System.out.println(n)): After the recursive call completes, n is printed. This results in printing the numbers in ascending order (from 1 to n).