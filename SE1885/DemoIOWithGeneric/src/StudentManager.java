
import java.io.IOException;
import java.util.Scanner;

public class StudentManager {

    public static void main(String[] args) throws IOException {
        boolean checkSuccessful;
        String fileStudentsName = "C:\\Users\\nkiem\\OneDrive\\Documents\\Courses\\PRO192\\SE1885\\ASMStuden\\Student";
        StudentList studentList = new StudentList();
        studentList.loadFromDirectory(fileStudentsName);

        Scanner sc = new Scanner(System.in);
        int yourchoice;
        do {
            System.out.println("\u001B[4m\u001B[32m ============================MENU=============================\u001B[0m");
            System.out.println("\u001B[32m║ ## Vui lòng chọn chức năng:                               ║\u001B[0m");
            System.out.println("\u001B[32m║============================================================\u001B[0m");
            System.out.println("\u001B[36m║ 1. List all Students.                                     ║\u001B[0m");
            System.out.println("\u001B[33m║ 2. Add a new student.                                     ║\u001B[0m");
            System.out.println("\u001B[35m║ 3. Remove a student based on its ID.                      ║\u001B[0m");
            System.out.println("\u001B[36m║ 4. Update a student based on its ID.                      ║\u001B[0m");
            System.out.println("\u001B[32m║ 5. Search students based on\u001B[0m\u001B[36m Tên\u001B[32m.                          ║\u001B[0m");
            System.out.println("\u001B[32m║ 6. Search students based on\u001B[36m ID.                           ║\u001B[0m");
            System.out.println("\u001B[33m║ 7. Show list of students (Gpa, Name, Yob) sort descending.║\u001B[0m");
            System.out.println("\u001B[36m║ 8. Save students to file, named students.txt.             ║\u001B[0m");
            System.out.println("\u001B[31m║ 0. Exit the program.                                      ║\u001B[0m");
            System.out.println("\u001B[32m ============================================================ \u001B[0m");
            yourchoice = sc.nextInt();
            sc.nextLine();

            switch (yourchoice) {
                case 0:
                    break;
                case 1:
                    studentList.printStudents();
                    break;
                case 2:
                    studentList.addStudent();
                    break;
                case 3:
                    checkSuccessful = studentList.removeStudent();
                    if (checkSuccessful) {
                        System.out.println("Student removed successfully !");
                    } else {
                        System.out.println("Student not found !");
                    }
                    break;
                case 4:
                    checkSuccessful = studentList.updateStudent();
                    if (checkSuccessful) {
                        System.out.println("Student updated successfully !");
                    } else {
                        System.out.println("Student updated unsuccessfully !");
                    }
                    break;

                case 5:
                    System.out.print("Enter Name: ");
                    String name1 = sc.nextLine();
                    System.out.println("Search Results:: ");
                    studentList.searchNameStudent(studentList, name1);
                    break;
                case 6:
                    System.out.print("Enter ID: ");
                    String id1 = sc.nextLine();
                    System.out.println("Search Results: ");
                    studentList.searchIdStudent(studentList, id1);
                    break;
                case 7:
                    boolean validSortChoice = false;
                    do {
                        System.out.println("Sort by:");
                        System.out.println("1. GPA");
                        System.out.println("2. Name");
                        System.out.println("3. Birth Year");
                        System.out.print("Enter your choice (1-3): ");

                        try {
                            int sortChoice = sc.nextInt();

                            if (sortChoice >= 1 && sortChoice <= 3) {
                                validSortChoice = true;

                                switch (sortChoice) {
                                    case 1:
                                        studentList.sortByGPA();
                                        break;
                                    case 2:
                                        studentList.sortByName();
                                        break;
                                    case 3:
                                        studentList.sortByBirthYear();
                                        break;
                                }
                            } else {
                                System.out.println("Invalid sort choice. Please choose again.");
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a number.");
                            sc.nextLine();
                        }
                    } while (!validSortChoice);
                    break;
                case 8:
                    studentList.saveToFile(fileStudentsName);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        } while (yourchoice != 0);
    }
}
