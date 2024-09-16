package FourteenOIXBinary;

import Array.reveserarr;

public class RotatedArray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    public int search(int[] nums, int target) {
        int piviot = findPivot(nums);

        //if you did not find the piviot the array is not rotated
        if(piviot== -1){
            //just do normal BS
            return BinarySearch(nums,target,0,nums.length - 1);
            
        }
        if(nums[piviot] == target){
            return piviot;
        }
        if(target >= nums[0]){
            return BinarySearch(nums,target,0,piviot-1);
        }
        return BinarySearch(nums,target,piviot+1,nums.length-1);
        
        }

        static int BinarySearch(int[] arr, int target, int start,int end){
            // int start = 0;
            // int end = arr.length - 1;
            while(start<=end){
                //find middle elememt
            //    int mid = (start+end) / 2;   might be possible that exceed the renge of int
            int mid =start +(end - start)/2;
    
            if(target<arr[mid]){
                end =mid-1; //element is on right side
    
            
    
            }else if(target>arr[mid]){   //elemnrt is on right side
               
                start = mid+1;
    
    
            }else{
                return mid;
            }
            }
                return -1;
        }
    
    //try to finf piviot
    static int findPivot(int[] arr){
            int start = 0;
            int end = arr.length -1;
        while(start<=end){

            int mid = start+ (end-start)/2;
            //4case

            if(mid< end && arr[mid]> arr[mid+1]){ //array  ot out of boun 
                return mid;

            }
            if(mid >start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return -1;
    }
    
    
}
