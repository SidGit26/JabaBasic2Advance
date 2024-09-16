package Array;
public class Search2D {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int [] [] arr = { {5,6,7}, 
                        {-2,4,9} };
        int target = 7;
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
               // System.out.println([i][j]);
               System.out.println("Target found at: (" + i + ", " + j + ")");   
            }
            }
        }

    }
    
}
