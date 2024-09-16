package FourteenOIXBinary;

public class FindFirstandLast {
    public static void main(String[] args) {
        
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};

      
        int start = search(nums,target,true);

        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] =end;
        return ans;
        
        
}

// this finction just retirn the index value of target 
int search(int[] nums,int target,boolean findStartIndex){
    int ans = -1;
    int start = 0;
    int end = nums.length - 1;
    while(start<=end){
        //find middle elememt
    //    int mid = (start+end) / 2;   might be possible that exceed the renge of int
    int mid =start +(end - start)/2;

    if(target<nums[mid]){
        end =mid-1; //element is on right side

    

    }else if(target>nums[mid]){   //elemnrt is on right side
       
        start = mid+1;


    }else{
        ans = mid;
        if(findStartIndex == true){
            end  = mid-1;
        }else{
            start = mid+1;
        }
    }
    }
    
        return ans;

}
     
};

    
