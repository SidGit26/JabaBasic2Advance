package NQTPREP;

import java.util.Arrays;

public class Frewquncy {
    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 2, 8, 5, 6, 2, 8, 2};

        // Sort the array
        Arrays.sort(arr);

        // Call the function to count frequencies
        frequency(arr);
        
    }

    static void frequency(int arr[]){
        int n = arr.length; //Rather than repeatedly calling arr.length in the loop condition, we store it once in the variable n

        //Traverse the sorted array

        for(int i = 0; i<n;i++){
            int count =1; //intlizze the count for the current elemnent

            //Count occurence of this current elemnet
            for (int j = i+1;j<n && arr[j] == arr[i];j++) {
                count++;
                i = j; // Move `i` to the last occurrence of the duplicate

                
            }
            System.out.println(+arr[i] + count );
        }
    }
    
}
