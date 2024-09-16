package arrayyoutube;

public class maxminarray {
    public static void main(String[] args) {
        int [] arr ={ 6,8,7,9,2,1};
        int temp;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j< arr.length;j++){
               //swaping sort
                if(arr[i] >arr[j]){
                
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;



                }
            }
        }
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[1]);
    }
    
}
