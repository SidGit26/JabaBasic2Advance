package FourteenOIXBinary;


public class Infintenumber {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90, 
            100, 130, 140, 160, 170};
            int target = 10;
            System.out.println(ans(arr,target));
    

    }
    static int ans(int [] arr, int target){
        //start of box size of 2

        //imp part starts
    int start = 0;
    int end = 1;
    //comdtion of the target to lie in the range 
    //target element is grater  than  end keep doubling the range

    while(target>arr[end]){
        int newStart = end + 1;  //like working temp
        //double the box value
        //end = prevous end + size of box *2
        end = end +  (end - start + 1) *2;  //+1 index of array 
        start = newStart;


    }
    return BinarySearch(arr,target,start,end);
    //imp part end

    }

    //not use arr.length we dont know start and end
    //find start and end and then apply BS
    //chunk check
    //doubling the size and finding the range
    static int BinarySearch(int[] arr, int target, int start, int end){
    
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
