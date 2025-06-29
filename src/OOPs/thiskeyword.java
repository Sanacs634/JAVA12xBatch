package OOPs;
//Use Case	                        Code Example	          Purpose
//Refer instance variable	        this.name = name;	      Disambiguates variable shadowing
//Constructor chaining	            this("John", 25);	      Reuse constructor logic
//Return current object	            return this;	          Useful in method chaining
//Pass current object as argument	someMethod(this);	      For passing current object to another method
//Invoke current object's method	this.display();	          Optional — can also just call display();


public class thiskeyword {
    static public class Student {
        String name;
        int age;

        // 1. Default constructor (constructor chaining using this())
        public Student() {
            this("Unknown", 0); // Calls the parameterized constructor
        }

        // 2. Parameterized constructor (using this to distinguish variables)
        public Student(String name, int age) {
            this.name = name; // 'this' differentiates between instance and parameter
            this.age = age;
        }

        // 3. Method to set values using method chaining (returns 'this')
        public Student setName(String name) {
            this.name = name;
            return this; // Returning current object for chaining
        }

        public Student setAge(int age) {
            this.age = age;
            return this; // Returning current object
        }

        // 4. Passing current object to another method
        public void register() {
            System.out.println("Registering student...");
            processRegistration(this); // Passing current object
        }

        // 5. Method receiving current object
        public void processRegistration(Student s) {
            System.out.println("Student " + s.name + " (Age: " + s.age + ") has been registered.");
        }

        // 6. Display method
        public void display() {
            System.out.println("Student Info -> Name: " + this.name + ", Age: " + this.age);
        }

        // 7. Main method
        public static void main(String[] args) {
            // Using default constructor
            Student s1 = new Student();
            s1.display(); // Output: Unknown, 0

            // Using parameterized constructor
            Student s2 = new Student("Alice", 20);
            s2.display();

            // Using method chaining with 'this'
            Student s3 = new Student().setName("Bob").setAge(25);
            s3.display();

            // Demonstrating passing 'this' to another method
            s3.register();
        }
    }

}
