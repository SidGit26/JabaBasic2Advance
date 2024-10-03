package OOPS;

class Student {    
    int age;
    int id;
    
    // Constructor
    Student(int id, int age) {
        // 'this' keyword is used to refer to the current object's fields
        this.id = id; 
        this.age = age;

        // Print statements to confirm constructor execution
        System.out.println("Hello World");
        System.out.println(id);
    }
}

public class Constructordemo {
    public static void main(String[] args) {
        // Creating an object of Student class which invokes the constructor
        Student student = new Student(5, 22);
    }
}
//Constructors are automatically called when you create an object. You don't need to explicitly call them, as Java automatically invokes the constructor when the new keyword is used.