package arrayyoutube;

public class CountPairs {
    public static void main(String[] args) {
        //unorderd map O(1)
        int arr[] = { 1,2,3,4,5,2};
        int targetsum = 3;
        int count = 0;
        for(int i =0; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i] + arr[j] == targetsum){
                        //sum is not the array
                    count++;
                    } 
                }
            }
        
        //output the result
        System.out.println("Number of pairs with sum:"  + targetsum  + " is: "  + count);
    }
};

