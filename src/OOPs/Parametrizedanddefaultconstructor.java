package OOPs;
//Default Constructor: Student() assigns default values.
//
//Parameterized Constructor: Student(String, int) assigns custom values passed at object creation.
//
//display() method is used to print the object data.
public class Parametrizedanddefaultconstructor {
    static class Student {
        String name;
        int age;

        // Default constructor
        public Student() {
            name = "Unknown";
            age = 0;
        }

        // Parameterized constructor
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display student info
        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {
            // Using default constructor
            Student s1 = new Student();
            s1.display(); // Output: Name: Unknown, Age: 0

            // Using parameterized constructor
            Student s2 = new Student("Alice", 20);
            s2.display(); // Output: Name: Alice, Age: 20
        }
    }

}
