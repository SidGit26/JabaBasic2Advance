package arrayyoutube;

public class Commonelementthreepointer {
    public static void main(String[] args) {
        int arr1[] = {1, 15, 10, 20, 40, 80, 100}; 
        int arr2[] = {2, 4, 5, 20, 80}; 
        int arr3[] = {3, 16, 20, 55, 76, 80, 100};
            findCommonelements(arr1, arr2, arr3);
    }
    static int findCommonelements(int[] arr1,int[] arr2,int[] arr3){
        int i =0, j = 0,  k = 0;
        System.out.println("Common Elements are");
        while(i<arr1.length && j< arr2.length && k < arr3.length){  //to avoid arrayoutofbound
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                System.out.println(arr2[j] + " ");
                i++;
                j++;
                k++;
                //If you didn't increment all three pointers after finding a common element, you'd be stuck comparing the same element repeatedly, leading to an infinite loop or multiple prints of the same value.
                //Once you've found a common element, you need to move forward in all three arrays because you’ve already processed the current element.
            }else if( arr1[i] < arr2[j]){
                i++;
            }else if( arr2[j] < arr3[k]){
                j++;
            }else{
                k++;
            }

        }
        return j;  
    }
}
