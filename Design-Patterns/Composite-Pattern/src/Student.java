public class Student implements OrganizationComponent{
    String name;
    String studentId;
    double tuition;

    public Student(String name, String studentId, double tuition) {
        this.name = name;
        this.studentId = studentId;
        this.tuition = tuition;
    }

    public double getTuition() {
        return tuition;
    }

    @Override
    public void displayDetails() {
        System.out.println("  [Student] " + name + " | Student ID: " + studentId + " | Tuition Balance: ₱" + tuition);
    }

}
