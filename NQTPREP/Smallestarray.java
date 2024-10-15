package NQTPREP;



public class Smallestarray {
    public static void main(String[] args) {
        int arr[] = {24,6,5,7,8,93,23,5};
        int smallest = small(arr);

        System.out.println(+smallest);


    }
    static int  small(int arr[]){
        int min =arr[0];
        for(int i = 0;i< arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;

    }
    
}


