package NQTPREP;

import java.util.Arrays;

public class small1 {
    public static void main(String[] args) {
        int []arr= {4,52,3,12,3,5};

        Arrays.sort(arr);

        System.out.println("The smallest number in the array is " +arr[0]);
        System.out.println("The smallest number in the array is " +arr[arr.length - 1]);

        
    }
   

    
}
