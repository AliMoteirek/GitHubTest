package övningsuppgift3d;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<Course> course = new ArrayList<>() ;

    public Teacher(String name, String socialSecurityNumber) {
        super(name, socialSecurityNumber);
    }

    public void addCourse (Course course) {
        this.course.add(course) ;
    }

    @Override
    public String toString() {
        return "Teacher: " + this.getName();
    }
}
