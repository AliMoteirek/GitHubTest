package övningsuppgift3d;

public class Deltagande {
    private Student student ;
    private Course course ;

    public Deltagande(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }
}
