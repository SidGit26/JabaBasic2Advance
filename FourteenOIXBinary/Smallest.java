package FourteenOIXBinary;

public class Smallest {
    public static void main(String[] args) {
        char [] letters = {'a','b','d','e'} ;
        char target = 'b';
        char ans = (char) smallest(letters, target);
        System.out.println(ans);

       

    }

    static int smallest(char[] letters, char target){
        int start = 0;
        int end = letters.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<=letters[mid]){
                end =mid-1; //element is on right side
    
            
    
            }else {   //elemnrt is on right side
               
                start = mid+1;
    
    
            }
    }
        return letters[start  % letters.length];

}
    }

