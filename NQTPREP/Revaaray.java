package NQTPREP;

import java.util.Arrays;

public class Revaaray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 4, 5};
        reversearray(arr);  // Reversing the entire array
        System.out.println(Arrays.toString(arr));  // Printing the reversed array
    }
    static void reversearray(int [] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    

    }
     static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
     }
    
}



// static void reversearray(int[] arr){
// int n = arr.length;
//for(int i = 0; i<n/2;i++){
//int temp = arr[i];
//arr[i] = arr[i-1];
//arr[n-1-1] = temp;
//}
//}
//}