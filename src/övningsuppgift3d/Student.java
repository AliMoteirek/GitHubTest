package övningsuppgift3d;

public class Student extends Person {

    public Student(String name, String socialSecurityNumber) {
        super(name, socialSecurityNumber);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Student: " + this.getName();
    }
}
