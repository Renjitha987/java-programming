class Student {
    String name = "Renjitha";

    void displayStudent() {
        System.out.println("Student Name: " + name);
    }
}
class Teacher {
    String name = "Anil";

    void displayTeacher() {
        System.out.println("Teacher Name: " + name);
    }
}

class Course {
    String courseName = "Java Programming";

    void displayCourse() {
        System.out.println("Course: " + courseName);
    }
}

public class College {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
        Course c = new Course();
        s.displayStudent();
        t.displayTeacher();
        c.displayCourse();
    }
}