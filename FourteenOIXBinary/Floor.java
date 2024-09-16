package FourteenOIXBinary;



public class Floor {
    public static void main(String[] args) {
        int [] arr = { 2,5,7,8,9,10,34};
        int target = 11;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    
        
    }

    
    static int ceiling(int[] arr, int target){
        if(target > arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<=arr[mid]){
                end =mid-1; //element is on right side
    
            
    
            }else if(target>=arr[mid]){   //elemnrt is on right side
               
                start = mid+1;
    
    
            }else{
                return mid;
            }
    }
        return end;  //important yaha grestes number smaller or equal to target number

}
}
    

