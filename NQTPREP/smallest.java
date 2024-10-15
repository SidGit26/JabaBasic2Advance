package NQTPREP;

public class smallest {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 6, 8, 1, 2 };
        System.out.println("Smallest element: " + findSmallest(arr));
    }
    
    static int findSmallest(int[] arr){
        int min = arr[0];  // Assume the first element is the smallest
        
        for(int i = 1; i < arr.length; i++){  // Start loop from the second element
            if(arr[i] < min){  // If current element is smaller than min, update min
                min = arr[i];
            }
        }
        
        return min;  // Return the smallest element
    }
}
