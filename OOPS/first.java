package OOPS;

public class first {
    class Student {
        String name;
        int roll_no;
        String address;
    }

    public static void main(String[] args) {
        // Create an instance of the Student class
        first outer = new f irst(); // Create an instance of the outer class to access the inner class
        Student std1 = outer.new Student(); // Use the instance to create an inner class object
        
        // Assign values to the fields
        std1.name = "Ram";
        std1.address = "xyz";
        std1.roll_no = 11;
        
        // Print the values
        System.out.println("Name: " + std1.name);
        System.out.println("Address: " + std1.address);
        System.out.println("Roll No: " + std1.roll_no);
    }
}
