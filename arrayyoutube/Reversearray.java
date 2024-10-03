package arrayyoutube;

import java.util.Arrays;

public class Reversearray {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        
        // Print original array
        System.out.println("Original Array: " + Arrays.toString(array));
        
        // Call the reverse method to reverse the array
        rev(array);
        
        // Print reversed array
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    public static void rev(int [] arr){
        int start =  0;
        int end = arr.length - 1;

        while(start<end){
            int temp = arr[start];
            arr [ start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }
        
    }
    
}
