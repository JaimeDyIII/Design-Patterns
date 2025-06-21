public class Client {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mr. Boris", "Differential Equations", 50000);
        Teacher teacher2 = new Teacher("Mr . Edward", "Data Structures and Algorithm", 55000);
        Student student1 = new Student("Leo", "123", 21000);
        Student student2 = new Student("Jaime", "321", 20000);

        Department department1 = new Department("Mathematics");
        department1.add(teacher1);
        department1.add(student1);

        Department department2 = new Department("Computer Science");
        department2.add(teacher2);
        department2.add(student2);

        College college1 = new College("Engineering College");
        college1.add(department1);
        college1.add(department2);

        Department department3 = new Department("Physics");
        Teacher teacher3 = new Teacher("Dr. Smith", "Quantum Mechanics", 60000);
        Student student3 = new Student("Sophia", "456", 22000);
        department3.add(teacher3);
        department3.add(student3);

        College college2 = new College("Science College");
        college2.add(department3);

        college1.displayDetails();
        college2.displayDetails();
    }
}
