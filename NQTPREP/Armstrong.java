package NQTPREP;

import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        //Input number from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num =  sc.nextInt();


        int Backup = num; //storing the orignal number 
        int sum = 0; // imtilazing sum to store the sum of cibes of digits


        //Logic for check ARMSstrong number
        while(num>0){
            int digit  =  num%10; //get the last digit
            sum = sum + (digit*digit*digit);
            num = num/10; //remove the last digit
        }
        if(sum==Backup){
            System.out.println("is ARMSOTNG");

        }
        else{
            System.out.println("Not");
        }

        sc.close();
    }
}