package Recursion;

import javax.swing.plaf.synth.SynthToolTipUI;

public class factorial {
    public static void main(String[] args) {
       // int ans = prodcut(1342);
        //System.out.println(ans);
        fun(5);
        
    }
//     static int sum(int n)
//     {
//         if(n==0){
//             return 0;
//         }
//         return (n%10) + sum (n/10);

    
    
// }

// static int prodcut(int n)
// {
//     if(n%10==n){ //one digit is remaing return that
//         return n;
//     }
//     return (n%10) * prodcut(n/10);



// }
static void fun(int n){
    if (n==0){
        return;
    }
    System.out.println(n);
//fun(n--);
fun(--n);
}


}
