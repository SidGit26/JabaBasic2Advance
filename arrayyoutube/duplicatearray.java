package arrayyoutube;

public class duplicatearray {
    public static void main(String[] args) {
        int[] arr = { 1,5,4,2,1,4,7};
        System.out.println("Duplicate Array :");
        
        
        for (int i = 0; i<arr.length;i++){  // i=0 we will compare 3 with other elememts in array after comparing then only the i =1 will exceute
            //start from 5 (j)
            for (int j = i+1;j<arr.length;j++){  //i=0  j = 0=1 =1   ( 1 != 5) like this we will compare
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }

        }

    }
    
}
