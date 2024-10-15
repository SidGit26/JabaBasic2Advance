package Recursion;

public class array1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        if (IsSorted(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
    static boolean  IsSorted(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                return true;
            }

            
        }
        return false; 

    }
}
    

