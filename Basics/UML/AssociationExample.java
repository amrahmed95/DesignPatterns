package Basics.UML;


class Student {
    private String name;
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void teach(Student student) {
        System.out.println("Teacher " + name + " is teaching " + student.getName());
    }

}



public class AssociationExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Miss Neha");
        Student student = new Student("Rahul");
        teacher.teach(student);

        // Output:
        // Teacher Miss Neha is teaching Rahul
    }
}
