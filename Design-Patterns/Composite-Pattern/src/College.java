import java.util.ArrayList;
import java.util.List;

public class College implements OrganizationComponent{
    String field;
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String field) {
        this.field = field;
    }

    public void add(OrganizationComponent organizationComponent) {
        if (!(organizationComponent instanceof Department)) {
            throw new IllegalArgumentException("Colleges can only contain Departments");
        }

        organizationComponents.add(organizationComponent);
    }

    public int countTotalStudents() {
        int totalStudents = 0;

        for (OrganizationComponent organizationComponent : organizationComponents) {
            if (organizationComponent instanceof Department department) {
                totalStudents += department.countDepartmentStudents();
            }
        }

        return totalStudents;
    }

    public double countCollegeBudget(){
        double totalBudget = 0;

        for (OrganizationComponent organizationComponent : organizationComponents) {
            if (organizationComponent instanceof Department department) {
                totalBudget += department.countDepartmentBudget();
            }
        }

        return totalBudget;
    }


    @Override
    public void displayDetails() {
        double totalBudget = countCollegeBudget();
        int totalStudents = countTotalStudents();

        System.out.println("=== College of " + field + " ===");
        System.out.println("Total Budget: ₱" + totalBudget);
        System.out.println("Total Students: " + totalStudents);
        System.out.println();
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.displayDetails();
        }
    }
}
