package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>(10);
        Scanner in  =  new Scanner(System.in);
        // list.add(67);
        // list.add(67);
        // list.add(67);
        

        //input
        for (int i = 0; i<5;i++){
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i<5;i++){
            System.out.println(list.get(i));
        }

        // System.out.println(list);

        // //1
        // list.set(0,99);
        // list.remove(2);
        // System.out.println(list);
    }
    
}
//size is fixed internally
// 