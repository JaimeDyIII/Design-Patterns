public class ClientApp{
    public static void main(String[] args){
          AttendanceSystem attendanceSystem = new AttendanceSystem();
          GradingSystem gradingSystem = new GradingSystem();
          LibrarySystem librarySystem = new LibrarySystem();

          SchoolManagementApp attendanceSystemAdapter = new AttendanceSystemAdapter(attendanceSystem);
          SchoolManagementApp gradingSystemAdapter = new GradingSystemAdapter(gradingSystem);
          SchoolManagementApp librarySystemAdapter = new LibrarySystemAdapter(librarySystem);

          attendanceSystemAdapter.integrateSystem();
          gradingSystemAdapter.integrateSystem();
          librarySystemAdapter.integrateSystem();
    }
}
