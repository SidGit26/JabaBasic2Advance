package FourteenOIXBinary;

public class MountainPeak {
    public static void main(String[] args) {
        
    }

    int search (int[] arr, int taget){
        int peak = findInMountainArray(arr);
        int firsttry = orderAgnosticBS(arr,taget,0,peak);
        if(firsttry !=-1){
            return firsttry;
        }
//try to search in other part
return orderAgnosticBS(arr, taget, peak+1, arr.length - 1);
    }
    public int findInMountainArray(int[] arr) {
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

    static int orderAgnosticBS (int [] arr , int target,int start ,int end){ //start and end by own giving
       

        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    start=mid-1;
                }else{
                    end = mid+1;
                }
                
                }else{
                    if(target>arr[mid]){
                        end=mid-1;
                    }else{
                        start = mid+1;
                    }
                }
            }
            return -1;



        }
    }

    //need work more>>
