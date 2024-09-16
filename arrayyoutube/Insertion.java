package arrayyoutube;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        int n ,m,p ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = s.nextInt();  //rerence varible teking int inout fromuser

        int a[]  = new int[n]; //object created for a
        int b[]  = new int[n+1];

        
        System.out.println("Enter values: ");
        for(int i = 0; i<n;i++){
           a[i] =s.nextInt();
        }
        System.out.println("Enter the index:");
        m =s.nextInt();
        System.out.println("Enter the New value:");
        p =s.nextInt();
        for(int i = 0; i<n+1;i++){
            if(i<m){
                b[i] =a[i];

            }else if(i==m){
                b[i] = p;
            }else{
                b[i] = a[i-1];

            }
        }
        System.out.println("Elemts are:"); //printing elements
        for(int i =0;i<n+1;i++){
            System.out.println(b [i]);  //ln nextline
        }
}
    
}
