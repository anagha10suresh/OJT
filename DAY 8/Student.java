public class Student {
    private String studentId, name;
    private int age;
    private double grades;

    public Student(String studentId, String name, int age, double grades) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public void updateGrades(double newGrades) {
        if (newGrades >= 0.0 && newGrades <= 100.0) {
            grades = newGrades;
            System.out.println("Updated grades for " + name + ": " + grades);
        } else {
            System.out.println("Invalid grade. Grades should be between 0.0 and 100.0.");
        }
    }

    public void displayStudentInfo() {
        System.out.println("ID: " + studentId + ", Name: " + name + ", Age: " + age + ", Grades: " + grades);
    }

    public static void main(String[] args) {
        Student s1 = new Student("1", "Mahima", 20, 89.0);
        Student s2 = new Student("2", "Anagha", 22, 90.0);

        s1.displayStudentInfo();
        s2.displayStudentInfo();

        s1.updateGrades(88.0);
        s2.updateGrades(95.0);

        s1.displayStudentInfo();
        s2.displayStudentInfo();

        s1.updateGrades(105.0);
    }
}
