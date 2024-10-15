package NQTPREP;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthGraphicsUtils;

public class GP {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        // Input the first term (a)
        System.out.print("Enter the first term (a): ");
        double a = sc.nextDouble();

        // Input the common ratio (r)
        System.out.print("Enter the common ratio (r): ");
        double r = sc.nextDouble();

        // Input the number of terms (n)
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        //caluclate the nth term
        double nthterm = a * Math.pow(r,n-1);
        System.out.println("The " + n + "th term of the GP is: " + nthterm);

        // Calculate the sum of the first n terms

        double sum;
        if(r!=1){
        
            sum = a * (Math.pow(r,n) - 1 / (r -1));

        }
        else{
            sum = a * n;
        }
        System.out.println("The sum of the first " + n + " terms of the GP is: " + sum);

        sc.close();
  }
    
}
