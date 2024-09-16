package arrayyoutube;
import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        int n, m;  // 'n' for array size, 'm' for the index to delete
        Scanner s = new Scanner(System.in);
        
        // Taking the number of elements in the array from the user
        System.out.print("Enter the number of elements in the array: ");
        n = s.nextInt();  // Reading array size
        
        // Initializing the original array 'a' with size 'n'
        int a[] = new int[n];  
        
        // Creating a new array 'b' that will hold the elements after deletion (size n-1)
        int b[] = new int[n-1];  
        
        // Taking input for the elements of array 'a'
        System.out.print("Enter the values: ");
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();  // Populating array 'a' with user input
        }
        
        // Taking the index of the element to be deleted
        System.out.print("Enter the index you want to delete: ");
        m = s.nextInt();  // Reading the index for deletion
        
        // Loop through the original array 'a' and copy elements to 'b'
        for(int i = 0; i < a.length; i++) {
            if(i < m) {  
                // If current index 'i' is less than the deletion index 'm', just copy 'a[i]' to 'b[i]'
                b[i] = a[i];  
            } else if(i == m) {
                // If current index 'i' is the deletion index 'm', skip this element (deletion logic)
                continue;  
            } else {
                // If current index 'i' is greater than 'm', shift elements by one (i-1) in array 'b'
                b[i-1] = a[i];  
            }
        }

        // Printing the elements of the new array 'b' after deletion
        System.out.print("Elements are: ");
        for(int i = 0; i < n-1; i++) {
            System.out.println(b[i]);  // Output each element of the modified array
        }
    }
}
