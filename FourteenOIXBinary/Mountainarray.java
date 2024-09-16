package FourteenOIXBinary;

public class Mountainarray {
    public static void main(String[] args) {
        
    }
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start + (end -start)/2;

            if(arr[mid]>arr[mid+1]){
                //this may be the answer but llok at left
                //you are in the dsc part of array
                //that is why end != mid-1
                end = mid;

            }else{
                //you are in asc
                start=mid+1; //because we know that mid+1 element > mid element


            }
            
        }// int he end  start  = end  it will print the laregest number
        //satrt and end always trying to find in the above two check and they are pointing to the one lelement that is the max obe what the checks
        //at every point of tome fpr start and end, they have more possible answer till that time if we are sayong 
        // only one item is remaing becasue of the above answer sp this is the last answer
            return start;
    }
}
    

