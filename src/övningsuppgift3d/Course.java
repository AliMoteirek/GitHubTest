package övningsuppgift3d;

public class Course {
    private Teacher teacher ;
    private String name ;

    public Course(String name) {
        this.name = name;
    }

    public void addTeacher (Teacher teacher) {
        this.teacher = teacher ;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getName() {
        return name;
    }
}
