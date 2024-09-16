package Array;

public class StringSearch {
    
    public static void main(String[] args) {
     // search charter in a string  \
     String name = "Siddharth Tiwari";
     char target = 'P';
     System.out.println(search(name,target));



    }
    // static boolean search(String str,chr target){
    //     String str;
    //     if(str.length() == 0){
    //         return false;
    //     }
    //    for(int i = 0; i<str.length();i++){
    //     if (target == str.charAt(i)){
    //         return true;
    //     }
       
    //    } 

    //    return false;


    static boolean search(String str, char target){
        
        if(str.length() == 0){ //empty string check
            return false;
        }
       for(int i = 0; i<str.length();i++){
        if (target == str.charAt(i)){
            return true;
        }
       
       } 

       return false;

    }
}
