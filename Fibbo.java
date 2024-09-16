 
public class Fibbo {
    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);

        int n = in.nextInt();

        int a = 0;   //previous index
        int b = 1;    // Current Index
        int count = 2;

        while(count <= n){
            int temp = b;
             b= b+a;
             a = temp;
             count++;
             
        }
        System.out.println(b);

    }
    
}
