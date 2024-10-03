package Pattern;
//important spaces concept
public class pattern6 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row = 0; row<2*n;row++){
            //important step
            int totalcoulmninROW = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalcoulmninROW;

            for(int s = 0; s<noOfSpaces;s++){
                System.out.print(" ");
            }
            for(int col = 0 ; col < totalcoulmninROW; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    }
    

