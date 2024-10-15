package Recursion.ARRAYREC;
//find array is sorted or not
public class first {
        public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        if (isSorted(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }

    

    public static boolean isSorted(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]>arr[left+] || arr[right]<arr[right-1]){
                return false; //array is not sorted

            }
            left++;
            right--;
        }
        return true;
    }
    
}
