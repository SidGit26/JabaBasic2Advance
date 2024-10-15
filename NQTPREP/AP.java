package NQTPREP;

import java.util.Scanner;


// a_{n}=a_{1}+(n-1)d
// a_n	=	the nᵗʰ term in the sequence
// a_1	=	the first term in the sequence
// d	=	the common difference between terms

public class AP {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("The First number of the series is: ");
        int a = sc.nextInt();

        Scanner ac =  new Scanner(System.in);
        System.out.println("The common diffrence of the series is: ");
        int d = ac.nextInt();

        Scanner nc =  new Scanner(System.in);
        System.out.println("The total numbers : ");
        int n = nc.nextInt();

        //int sum = 0;

        // for(int i=0;i<n;i++){
        //     int term = a + i * d;
        //     System.out.println("Term " + (i+1) + ": " + term);
        //     sum += term;
        // }

        // Direct calculation of the sum using the formula
        int sum = (n * (2 * a + (n - 1) * d)) / 2;

        // 4. Print the total sum of the AP
System.out.println("Sum of the AP: " + sum);
    }
    
}
