package NQTPREP;

import java.util.Arrays;

public class seclandsmall {
    public static void main(String[] args) {
        int arr[] = { 1,3,4,6,3,5,9,7};

        System.out.println(Arrays.toString(arr));
        bubblesort(arr);
        
        System.out.println();

        //Get second smallest and second largest
        if(arr.length >=2 ){
            System.out.println("Second smallest element: " + arr[1]);
            System.out.println("Second largest element: " + arr[arr.length - 2]);
        }
        else {
            System.out.println("Array doesn't have enough elements to find second smallest and second largest.");
        }


    }


    static void bubblesort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n;i++){
            for(int j =1;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
    
}
