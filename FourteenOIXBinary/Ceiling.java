package FourteenOIXBinary;

public class Ceiling {
    public static void main(String[] args) {
        int [] arr = { 2,5,7,8,9,10,34};
        int target = 11;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    
        
    }

    
    static int ceiling(int[] letters, int target){
        int start = 0;
        int end = letters.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<=letters[mid]){
                end =mid-1; //element is on right side
    
            
    
            }else {   //elemnrt is on right side
               
                start = mid+1;
    
    
            }
    }
        return letters[start  % letters.length];

}
}
    

