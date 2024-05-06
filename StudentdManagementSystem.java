import java.util.Scanner;
import java.util.InputMismatchException;
public class StudentdManagementSystem {
    static int totalStudents = 0;
    static String[] studentNames = new String[100];
    static int[] studentIDs = new int[100];
    static int[] studentAges = new int[100];
    static String[] studentGrades = new String[100];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        // Make the welcome message and choice list
            System.out.println("Welcome to Student Record Management System");
            System.out.println("1. Add New Student");
            System.out.println("2. Update Student Information");
            System.out.println("3. View Student Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewStudent(scanner);
                    break;
                case 2:
                    updateStudentInformation(scanner);
                    break;
                case 3:
                    viewStudentDetails(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
// make the add new student information
    public static void addNewStudent(Scanner scanner) {
        // Increment totalStudents before adding a new student
        totalStudents++;
    
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        System.out.print("Enter student grade: ");
        String grade = scanner.next();
    
        // Store student information at index totalStudents - 1
        studentNames[totalStudents - 1] = name;
        studentIDs[totalStudents - 1] = id;
        studentAges[totalStudents - 1] = age;
        studentGrades[totalStudents - 1] = grade;
    
        System.out.println("Student added successfully.");
    }
// Make the student update information
    public static void updateStudentInformation(Scanner scanner) {
        System.out.print("Enter student ID to update information: ");
        int id = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < totalStudents; i++) {
            if (studentIDs[i] == id) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.print("Enter new student name: ");
            studentNames[index] = scanner.next();
            System.out.print("Enter new student age: ");
            studentAges[index] = scanner.nextInt();
            System.out.print("Enter new student grade: ");
            studentGrades[index] = scanner.next();
            System.out.println("Student information updated successfully.");
        } else {
            System.out.println("Student ID not found.");
        }
    }
// make viewstudentDetails to see the information of students
    public static void viewStudentDetails(Scanner scanner) {
        System.out.print("Enter student ID to view details: ");
        int id = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < totalStudents; i++) {
            if (studentIDs[i] == id) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Student Name: " + studentNames[index]);
            System.out.println("Student ID: " + studentIDs[index]);
            System.out.println("Student Age: " + studentAges[index]);
            System.out.println("Student Grade: " + studentGrades[index]);
        } else {
            System.out.println("Student ID not found.");
        }
    }
}
