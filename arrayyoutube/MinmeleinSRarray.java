package arrayyoutube;
//* FInd minm element in a sorted and  roated array */
public class MinmeleinSRarray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int ans =   BinarySearch(arr);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            //find middle elememt
        //    int mid = (start+end) / 2;   might be possible that exceed the renge of int
        int mid =start +(end - start)/2;

        if(start<mid && arr[mid] < arr[mid-1])
        {
            return arr[mid]; //element is on right side

        

        }else if(end>mid && arr[mid+1] <arr[mid]){   //elemnrt is on right side
           
            return arr[mid+1];


        }else if(arr[end] > arr[mid]){


            return mid -1;
        }else{
            start = mid+1;
        }
        }
            return -1;
    
}
}