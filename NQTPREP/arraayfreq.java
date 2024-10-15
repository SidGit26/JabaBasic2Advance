package NQTPREP;

import java.util.Arrays;

public class arraayfreq {
    public static void main(String[] args) {
        int arr [] = { 1,2,4,5,3,2,1,1,2,4,5};
        int n = arr.length;

        //array to store visited elements frequencies
        boolean[] visited = new boolean[5]; // creates a boolean array of size 5
        Arrays.fill(visited, false); // sets all elements in the array to false

        for(int i =0; i<n;i++){
             // Skip this element if it's already been counted
            if(visited[i])
            continue;
            int count = 1;  // Count current element
            //check for other occurences of arr[i]
            for(int j= i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count ++;
                    visited[i]  = true;
                }

            }
            System.out.println(arr[i]  + " appears " + count + " times ");
        }
    }
    
}
