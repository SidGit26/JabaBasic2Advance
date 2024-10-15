package NQTPREP;

import java.util.Scanner;

// Example 1:
// Input: 1 3
// Output: 3
// Explanation: Answer is 3,since 3 is greater than 1.

public class Greatoftwo {
    public static void main(String[] args) {
        
    

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int p = sc.nextInt();


    System.out.println("The greatest of the two numbers is "+Math.max(n, a));
    System.out.println("The greatest of the three numbers is "+Math.max(n,  Math.max(a, p)));
    // if(n>a){
    //     System.out.println("The greatest of two is: " +n);

    // }
    // else{
    //     System.out.println("The greatest of two is: " +a);
    // }

    sc.close();
}
}