import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        
        StudentRecord student = new StudentRecord(studentID, name, course);

        
        student.displayInfo();

        
        scanner.close();
    }
}
