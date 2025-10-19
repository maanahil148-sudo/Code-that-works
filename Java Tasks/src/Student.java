import java.util.Scanner;

public class Student{
    String name;
    int id;
    double marks;

    public void addStudent(String N, int I, double M) {
        name = N;
        id = I;
        marks = M;
        System.out.println("Student added successfully!");
    }

    public void viewStudent() {
        if (name == null ) {
            System.out.println("No student record found!");
        } else {
            System.out.println("\n Student Details");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Marks: " + marks);
        }
    }

    public void removeStudent() {
        name = "";
        id = 0;
        marks = 0;
        System.out.println("Student record removed.");
    }

    public void searchStudentById(int searchId) {
        if (name == null ) {
            System.out.println("No record available to search!");
        } else if (id == searchId) {
            System.out.println("\n Student Found ");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Marks: " + marks);
        } else {
            System.out.println("No student found with ID: " + searchId);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Student student = new Student();
        int choice;

        do {
            System.out.println("\n Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Search Student by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    input.nextLine();
                    System.out.print("Enter name: ");
                    String N = input.nextLine();
                    System.out.print("Enter ID: ");
                    int I = input.nextInt();
                    System.out.print("Enter marks: ");
                    double M = input.nextDouble();
                    student.addStudent(N, I, M);
                    break;

                case 2:
                    student.viewStudent();
                    break;

                case 3:
                    student.removeStudent();
                    break;

                case 4:
                    System.out.print("Enter student ID to search: ");
                    int searchId = input.nextInt();
                    student.searchStudentById(searchId);
                    break;

                case 5:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        input.close();
    }
}
