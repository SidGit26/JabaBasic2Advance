package arrayyoutube;

public class CommonelemtsrEJECTEDNOTOPTIMAL {
    public static void main(String[] args) {
        int arr1 [] = {1,15,10,20,40,80,100 };
        int arr2 [] = {2,4,5,20,80};
        int arr3 [] = {3,16,20,55,76,80,100};
        for(int i = 0 ;i< arr1.length;i++){
            for(int k = 0;k<arr2.length;k++){
                for(int j = 0;j<arr3.length;j++){
                    if(arr1[i] == arr2[k] && arr2[k] ==arr3[j]){
                        System.out.println(arr2[k]);

                    }
                }
            }
        }
    }
    
}
