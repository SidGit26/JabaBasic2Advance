package Pattern;

public class pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row = 0; row<2*n;row++){
            //important step
            int totalcoulmn = row > n ? 2 * n - row : row;
            for(int col = 1; col<totalcoulmn;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
   
    
}
