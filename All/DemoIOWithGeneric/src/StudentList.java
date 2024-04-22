
import java.util.Scanner;

public class StudentList {
    protected Student createObjectFromLine(String line) {
        String[] arr = line.split(",");
        String id = arr[0].trim();
        String name = arr[1].trim();
        int yob = Integer.parseInt(arr[2].trim());
        double gpa = Double.parseDouble(arr[3].trim());
        return new Student(id, name, yob, gpa);
    }

    protected Student createObjectFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input student ID: ");
        String studentID = scanner.nextLine();
        System.out.print("Input student name: ");
        String name = scanner.nextLine();

        int yearOfBirth;
        do {
            System.out.print("Input year of birth: ");
            try {
                yearOfBirth = Integer.parseInt(scanner.nextLine());
                if (yearOfBirth > 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                // Handle non-integer input
            }
            System.out.println("Year of birth must be a positive integer. Please try again!");
        } while (true);

        double gpa;
        do {
            System.out.print("Input GPA: ");
            try {
                gpa = Double.parseDouble(scanner.nextLine());
                if (gpa >= 0 && gpa <= 4.0) {
                    break;
                }
            } catch (NumberFormatException e) {
                // Handle non-double input
            }
            System.out.println("GPA must be a number between 0.0 and 4.0. Please try again!");
        } while (true);

        return new Student(studentID, name, yearOfBirth, gpa);
    }
}