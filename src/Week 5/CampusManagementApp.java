class Person {
    private String name;
    private String id;
    Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
    String getName() {
        return name;
    }
    String getId() {
        return id;
    }
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
    void displayInfo(String name) {
        System.out.println("Person Name: " + name);
    }
    void displayInfo(String name, String id) {
        System.out.println("Person Name: " + name);
        System.out.println("Person ID: " + id);
    }
}
class Student extends Person {
    private int[] marks;
    Student(String name, String id, int[] marks) {
        super(name, id);
        this.marks = marks;
    }
    double calculateAverage() {
        if (marks.length == 0) {
            return 0;
        }
        int total = 0;
        for (int i=0;i<marks.length;i++) {
            total += marks[i];
        }
        return (double) total / marks.length;
    }
    @Override
    void printDetails() {
        System.out.println("student Name: " + getName());
        System.out.println("student ID: " + getId());
        System.out.println("student Average Marks: " + calculateAverage());
    }
}
class Instructor extends Person {
    private String subject;
    Instructor(String name, String id, String subject) {
        super(name, id);
        this.subject = subject;
    }
    @Override
    void printDetails() {
        System.out.println(" instructor Name: " + getName());
        System.out.println(" instructor ID: " + getId());
        System.out.println("instructor Subject: " + subject);
    }
}
class CampusRegistry {
    private Person[] people;
    private int count;
    CampusRegistry(int capacity) {
        people = new Person[capacity];
        count = 0;
    }
    void addPerson(Person person) {
        if (count < people.length) {
            people[count] = person;
            count++;
        }
    }
    void printAllPeople() {
        for (int i = 0; i < count; i++) {
            people[i].printDetails();
            System.out.println();
        }
    }
    void searchPerson(String name) {
        for (int i = 0; i < count; i++) {
            if (people[i].getName().equals(name)) {
                people[i].printDetails();
                return;
            }
        }
        System.out.println("Person not found.");
    }
 }
public class CampusManagementApp {
    public static void main(String[] args) {
        CampusRegistry registry = new CampusRegistry(5);
        int[] marks1 = {100, 90, 88};
        int[] marks2 = {98, 82, 80};
        int[] marks3 = {92, 99, 90};
        Student student1 = new Student("Aman", "S101", marks1);
        Student student2 = new Student("Riya", "S102", marks2);
        Student student3 = new Student("Karan", "S103", marks3);
        Instructor instructor1 =new Instructor("Dr. Sharma", "I101", "Java");
        Instructor instructor2 =new Instructor("Dr. Mehta", "I102", "DBMS");
        registry.addPerson(student1);
        registry.addPerson(student2);
        registry.addPerson(instructor1);
        registry.addPerson(instructor2);
        registry.printAllPeople();
        registry.searchPerson("Riya");
        Person person = new Person("Neha", "P101");
        person.displayInfo("Neha");
        person.displayInfo("Neha", "P101");
    }
}
