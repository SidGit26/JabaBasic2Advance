package OOPS;

class ConExamm {
    int id;
    int age;

    // Parameterized constructor
    ConExamm(int id, int age) {
        this.id = id;
        this.age = age;
    }

    // No-argument constructor (optional, but useful if you need it)
    ConExamm() {
        this.id = 0; // Default value
        this.age = 18; // Default value
    }
}

public class ConExam {
    public static void main(String[] args) {
        // Using parameterized constructor
        Student student1 = new Student(1, 20);
        
        // Using default constructor
        ConExamm student2 = new ConExamm();
    }
}
