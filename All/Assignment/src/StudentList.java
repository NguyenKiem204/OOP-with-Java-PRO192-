

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentList extends ArrayList<Student> {

    private String id, name;
    private int yob;
    private double gpa;
    private Scanner scanner = new Scanner(System.in);
    private BufferedReader br;
    private String line;
    private String[] arr;

    //Load data from file
    public boolean loadFromFile(String fileName) throws IOException {
        try {
            br = new BufferedReader(new FileReader(fileName));
            line = br.readLine();
            while (line != null) {
                arr = line.split(",");
                id = arr[0].trim();
                name = arr[1].trim();
                yob = Integer.parseInt(arr[2].trim());
                gpa = Double.parseDouble(arr[3].trim());
                this.add(new Student(id, name, yob, gpa));
                line = br.readLine();
            }
            br.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
        }
        return false;
    }

    //Save data to file
    public boolean saveToFile(String fileName) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fileName));
            for (Student student : this) {
                pw.println(student.getId() + "," + student.getName() + "," + student.getYob() + "," + student.getGpa());
            }
            pw.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    //Search student by ID
    public int searchID(String studentID) {
        for (int i = 0; i < this.size(); i++) {
            if (studentID.equals(this.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    //Add student to the list
    public void addStudent() {
        boolean checkStudentID;
        do {
            System.out.print("Input student ID: ");
            String studentID = scanner.nextLine();
            checkStudentID = false;
           for (Student student : this) {
            if (studentID.equalsIgnoreCase(student.getId())) { 
                checkStudentID = true;
                System.out.println("This student ID already exists. Try another one!");
                break;
            }
        }
            if (!checkStudentID) {
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

                this.add(new Student(studentID, name, yearOfBirth, gpa));
                System.out.println("Student has been added successfully!");
            }
        } while (checkStudentID);
    }

    //Remove a student by ID

public boolean removeStudent() {
    System.out.print("Input student ID to remove: ");
    String removedID = scanner.nextLine();
    int pos = searchID(removedID);
    if (pos >= 0) {
        this.remove(pos);
        System.out.println("Student with ID " + removedID + " has been removed.");

        // Rewrite data to file excluding the removed student
        try {
            File file = new File("C:\\Users\\nkiem\\OneDrive\\Documents\\Courses\\PRO192\\SE1885\\Assignment\\Student\\students.txt");
            FileWriter writer = new FileWriter(file);
            for (Student student : this) {
                writer.write(student.getId() + "," + student.getName() + "," + student.getYob() + "," + student.getGpa() + "\n");
            }
            writer.close();
            return true;
        } catch (IOException e) {
            System.out.println("Error occurred while writing to file: " + e.getMessage());
            return false;
        }
    } else {
        System.out.println("Student ID not found!");
        return false;
    }
}


    //Update a student's information
   public boolean updateStudent() {
    System.out.print("Input student ID to update: ");
    String updatedID = scanner.nextLine();
    int pos = searchID(updatedID);
    if (pos >= 0) {
        System.out.print("Input new student ID: ");
        String newID = scanner.nextLine();

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

        // Update student information
        this.get(pos).setId(newID);
        this.get(pos).setName(name);
        this.get(pos).setYob(yearOfBirth);
        this.get(pos).setGpa(gpa);
        System.out.println("Student information has been updated.");
        return true;
    } else {
        System.out.println("Student ID not found!");
        return false;
    }
}


    public void printStudents() {
        if (this.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("List of Students:");
            for (Student student : this) {
                System.out.println(student.toString());
            }
        }
    }
   


    public void sortByGPA() {
        if (this.isEmpty()) {
            System.out.println("No students available.");
        } else {
            Collections.sort(this);
            System.out.println("List of Students sorted by GPA:");
            for (Student student : this) {
                System.out.println(student.toString());
            }
        }
    }


    public void sortByName() {
        if (this.isEmpty()) {
            System.out.println("No students available.");
        } else {
            Collections.sort(this, new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return s1.getName().compareTo(s2.getName());
                }
            });
            System.out.println("List of Students sorted by Name:");
            for (Student student : this) {
                System.out.println(student.toString());
            }
        }
    }

    public void sortByBirthYear() {
        if (this.isEmpty()) {
            System.out.println("No students available.");
        } else {
            Collections.sort(this, new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return Integer.compare(s1.getYob(), s2.getYob());
                }
            });
            System.out.println("List of Students sorted by Birth Year:");
            for (Student student : this) {
                System.out.println(student.toString());
            }
        }
    }


    public void searchNameStudent(ArrayList<Student> list, String name) {
        ArrayList<Student> s1 = new ArrayList<>();
        int count = 0;
        for (Student student : list) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                s1.add(student);
                count++;
            }
        }
        if (count > 0) {
            for (Student student : s1) {
                System.out.println(student);
            }
        } else {
            System.out.println("Không tìm thấy!!");
        }
    }

    // Tìm kiếm sinh viên dựa trên mã sinh viên
    public void searchIdStudent(ArrayList<Student> list, String id) {
        ArrayList<Student> s = new ArrayList<>();
        for (Student student : list) {
            if (student.getId().toLowerCase().contains(id.toLowerCase())) {
                s.add(student);
            }
        }
        for (Student student : s) {
            System.out.println(student);
        }
    }
}

