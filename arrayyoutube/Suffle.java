package arrayyoutube;

public class Suffle {
    public static void main(String[] args) {
      
    }
    public String restoreString(String s, int[] indices){
       char [] str = new char[s.length()];
        for(int i = 0; i<s.length();i++){
            str[indices[i]] = s.charAt(i);


        }
        return String.valueOf(str);
    }
}



//Note
//int[] indices: An array representing where each character of s should go in the new string.

//arr[indices[i]] = s.charAt(i);:
//This is the core operation where each character in the string s is placed in the new array arr at the position specified by indices[i].
//ime Complexity:

//O(n) where n is the length of the string s, as each character is processed once.
//Space Complexity:

//O(n) because an additional array arr is created to store the rearranged characters.