package NQTPREP;

import java.util.Scanner;

//Example 1:
// Input: N=5
// Output: 15
// Explanation: 1+2+3+4+5=15


public class SumfirstN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Number is:");
        //int n = sc.nextInt();
        long n = sc.nextLong();
    
        //int sum = 0;
        long sum =0;
        if(n>0){
            sum = n*(n+1)/2;
            System.out.println("the sum of n natural numbers is "+ sum );
        }
        else{
            System.out.println("The Number is not natural");
        }
        sc.close();
        
    }

    }
    

