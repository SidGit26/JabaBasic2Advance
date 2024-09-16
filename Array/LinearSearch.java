package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int [] nums = { 23, 25, 45, 18, 19, 65, 9};
        int target = 19;
        int ans = linearsearch(nums, target);
        System.out.println(ans);

    }
// seacrh in the array return the index not found  retirn -1
    static int linearsearch(int [] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        //run a for loop
        for(int  index =0; index<arr.length;index++){
        // check the element at every index of it is = target
        int element = arr[index];
        if(element == target){

            return index; 
           }
        }
    //this  line will exute if none of the rtun statemeeny fond
   // hence elemnrnt is not found
        return target;
    }
    
}
