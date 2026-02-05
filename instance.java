class Student {
    String name;
    int rollNo;

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Instance Method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class instance {
    public static void main(String[] args) {

        Student s1 = new Student("Yash", 12);

        // calling instance method using object
        s1.displayDetails();
    }
}
