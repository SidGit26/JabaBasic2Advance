package OOPS;


class Parentclass{
    void display(){
        System.out.println("parent class method");
    }
}
class childclass extends Parentclass{
    void show(){
        System.out.println("Child class inhertis");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        childclass child1 = new childclass();
        child1.display();
        System.out.println();
        child1.show();

    }
    
}
