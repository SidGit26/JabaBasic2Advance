package FourteenOIXBinary;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {2,5,7,8,9,10,34};
        int target = 7;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);
    }
    //return the index 
    //return -1 if not found in given array
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
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
}
