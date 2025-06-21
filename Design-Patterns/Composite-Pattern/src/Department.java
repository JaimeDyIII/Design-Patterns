import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationComponent{
    String subject;
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public Department(String subject) {
        this.subject = subject;
    }

    public void add(OrganizationComponent organizationComponent) {
        if (organizationComponent instanceof College) {
            throw new IllegalArgumentException("Departments cannot contain Colleges");
        }

        organizationComponents.add(organizationComponent);
    }

    public int countDepartmentStudents(){
        int count = 0;
        for (OrganizationComponent organizationComponent : organizationComponents) {
            if (organizationComponent instanceof Student){
                count++;
            }
        }

        return count;
    }

    public double countDepartmentBudget(){
        double totalBudget = 0;
        for (OrganizationComponent organizationComponent : organizationComponents) {
            if (organizationComponent instanceof Teacher teacher){
                totalBudget += teacher.getSalary();
            } else if (organizationComponent instanceof Student student){
                totalBudget -= student.getTuition();
            }
        }

        return totalBudget;
    }

    @Override
    public void displayDetails() {
        double totalBudget = countDepartmentBudget();
        int totalStudents = countDepartmentStudents();

        System.out.println("--- Department of " + subject + " ---");
        System.out.println("Total Budget: ₱" + totalBudget);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Department Entities:");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.displayDetails();
        }
        System.out.println();
    }
}
