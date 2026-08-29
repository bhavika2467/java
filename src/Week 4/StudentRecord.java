/*
60. TASK 1 - STUDENT RECORD
---------------------------
Required filename: StudentRecord.java
Create a Student model class and a public StudentRecord driver.
Student requirements:
- private String name
- private String studentId
- private int mark
- a constructor receiving all three values
- name and studentId must be non-null and non-blank
- mark must remain between 0 and 100
- getters for all fields
- boolean setMark(int newMark), preserving the old mark when invalid
- boolean hasPassed()
- String getClassification()
- a useful toString()
Driver requirements:
- create at least three students
- test marks 49, 50, 79, 80, and an invalid update
- display every object directly with println */
class Student {
    private String name;
    private String studentId;
    private int mark;
    public Student(String name, String studentId, int mark) {
        if (name == null || name.isBlank()) {
            System.out.println("Name cannot be null or blank");
        }
        if (studentId == null || studentId.isBlank()) {
            System.out.println("Student ID cannot be null or blank");
        }
        if (mark < 0 || mark > 100) {
            System.out.println("Mark must be between 0 and 100");
        }
        this.name = name;
        this.studentId = studentId;
        this.mark = mark;
    }
     String getName() {
        return name;
    }
     String getStudentId() {
        return studentId;
    }
     int getMark() {
        return mark;
    }
    boolean setMark(int newMark) {
        this.mark = newMark;
        return true;
    }
     boolean hasPassed() {
        return mark >= 50;
    }
     String getClassification() {

        if (mark >= 80) {
            return "Distinction";
        } 
        else if (mark >= 50) {
            return "Pass";
        } 
        else {
            return "Fail";
        }
    }
      void print() {
    System.out.println( "Student name" + name );
    System.out.println("student id"+studentId);
    System.out.println("marks"+mark);
}
public class StudentRecord {
    public static void main(String[] args) {
        Student s1 = new Student("Bhavika", "S101", 49);
        Student s2 = new Student("Ananya", "S102", 50);
        Student s3 = new Student("Aakansha", "S103", 79);
        Student s4 = new Student("Bhavna", "S104", 80);
        System.out.println(s1);   
        System.out.println(s2);  
        System.out.println(s3);   
        System.out.println(s4);   
        boolean result = s1.setMark(101);
        System.out.println(s1);
    }
} 
}
