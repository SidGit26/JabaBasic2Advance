package Pattern;

public class firstpattern {
    public static void main(String[] args) {
       
        pattern(8);
    }
    static void  pattern(int n){
        for (int  row =1;row <= n; row++){ //no of times lines will run
            //idetify for every row number how many coilums are there OR types of element in the column
            for(int col = 1; col <= row; col++){
                System.out.print("* "); //donot use ln on println
          }
            //when one row is printed we need to add new line
            System.out.println();

        }
    }
    
}
