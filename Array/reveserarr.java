package Array;

import java.util.Scanner;

public class reveserarr {
    public static void main(String[] args) {
        int arr [] = {2,5,7,8,9};
        int i =0;
        int  j = arr.length - 1;
        while(i<j){
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
            i++;
            j--;
        
        }
        
for(i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

    }
    
}
