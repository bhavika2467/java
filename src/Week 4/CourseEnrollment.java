/*
65. TASK 6 - COURSE ENROLLMENT
------------------------------
Required filename: CourseEnrollment.java
Create a Course class and a public CourseEnrollment driver.
Course requirements:
- course code, title, capacity, and enrolled count
- constructor establishes a positive capacity and zero enrollment
- boolean enroll()
- boolean withdraw()
- boolean isFull()
- int getAvailableSeats()
- no direct setter for enrolled count
- readable toString()
*/
       class Course {  
        private String courseCode;
        private String title;
        private int capacity;
        private int enrolledCount;
        Course(String courseCode, String title, int capacity) {
            this.courseCode = courseCode;
            this.title = title;
            this.capacity = capacity;
            enrolledCount = 0;
        }
        public boolean enroll() {
            if (enrolledCount >= capacity) {
                System.out.println("Course is full");
                return false;
            }
            enrolledCount++;
            return true;
        }
        public boolean withdraw() {
            if (enrolledCount == 0) {
                System.out.println("No student is enrolled");
                return false;
            }
            enrolledCount--;
            return true;
        }
        public boolean isFull() {
            return enrolledCount == capacity;
        }
        public int getAvailableSeats() {
            return capacity - enrolledCount;
        }
    } public class CourseEnrollment {
    public static void main(String[] args) {
        Course c1 = new Course("CS101", "Java Programming", 3);
        Course c2 = new Course("AI201", "Machine Learning", 2);
        System.out.println(c1);
        System.out.println();
        System.out.println(c2);
        System.out.println();
        System.out.println("Enroll: " + c1.enroll());
        System.out.println("Enroll: " + c1.enroll());
        System.out.println("Enroll: " + c1.enroll());
        System.out.println();
        System.out.println(c1);
        System.out.println();
        System.out.println("Enroll when full: " + c1.enroll());
        System.out.println();
        System.out.println("Withdraw: " + c1.withdraw());
        System.out.println();
        System.out.println(c1);
        System.out.println();
        System.out.println("Withdraw from empty course: " + c2.withdraw());
        System.out.println("Enroll in c2: " + c2.enroll());
        System.out.println();
        System.out.println(c2);
    }
}
