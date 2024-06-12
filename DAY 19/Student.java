public class Student {
    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        this.grade = grade;
    }

    public static void main(String[] args) {
        // Create a new student object
        Student student1 = new Student("Alice", 1, 85.5);
        
        // Print the student's details
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getId());
        System.out.println("Student Grade: " + student1.getGrade());

        // Modify the student's details
        student1.setName("Alice Johnson");
        student1.setId(2);
        student1.setGrade(90.0);

        // Print the updated student's details
        System.out.println("Updated Student Name: " + student1.getName());
        System.out.println("Updated Student ID: " + student1.getId());
        System.out.println("Updated Student Grade: " + student1.getGrade());

        // Attempt to set an invalid grade to demonstrate exception handling
       
    }
}
