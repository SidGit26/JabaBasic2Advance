package NQTPREP;

public class lararray {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 6, 8, 1, 2 };
        System.out.println("Largets element: " + largestelement(arr));
    }
    
    static int largestelement(int[] arr){
        int max = arr[0];  // Assume the first element is the smallest
        
        for(int i = 1; i < arr.length; i++){  // Start loop from the second element
            if(arr[i] > max){  // If current element is smaller than min, update min
                max = arr[i];
            }
        }
        
        return max;  // Return the smallest element
    }
}
