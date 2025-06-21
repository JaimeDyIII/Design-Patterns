public class Teacher implements OrganizationComponent {
    String name;
    String subject;
    double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void displayDetails() {
        System.out.println("  [Teacher] " + name + " | Subject: " + subject + " | Salary: ₱" + salary);
    }
}
