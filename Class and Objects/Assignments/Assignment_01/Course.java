package Assignments.Assignment_01;

public class Course {
    String courseName;
    int enrolledStudents;

    static int maxCapacity;

    void enrollStudent(String student){
        if (enrolledStudents < maxCapacity) {
            enrolledStudents++;
            System.out.println(student + " enrolled in " + courseName);
        }
        else{
            System.out.println("Course is full");
        }

    }

    void unenrollStudent(String student){
        if (enrolledStudents > 0) {
            enrolledStudents--;
            System.out.println(student + " unenrolled from " + courseName);
        }
        else{
            System.out.println("Course is empty");
        }
    }

    static void setMaxCapacity(int capacity){
        maxCapacity = capacity;
    }
}