package övningsuppgift3d;

import java.util.ArrayList;
import java.util.List;

public class AllStudentsPrinter {

    public AllStudentsPrinter() {

        Student ali = new Student("Mazen Moteirek" , "123123") ;
        Student erik = new Student("Jimmy Eriksson", "147975") ;
        Student sara = new Student("Sandra Olsson" , "334455") ;

        List<Student> allStudents = new ArrayList<>();
        allStudents.add(ali) ;
        allStudents.add(erik) ;
        allStudents.add(sara) ;

        Teacher nadia = new Teacher("Nadia Peterson" , "123243") ;
        Teacher katya = new Teacher("Katya Andersson" , "12375") ;
        Teacher tanya = new Teacher("Tanya Nilson" , "87349") ;

        Course calculus = new Course("Calculus") ;
        Course java = new Course("Java") ;
        Course electricCircuit = new Course("Electric Circuit") ;

        Deltagande d1 = new Deltagande(ali, calculus) ;
        Deltagande d2 = new Deltagande(ali, java) ;
        Deltagande d3 = new Deltagande(ali, electricCircuit) ;
        Deltagande d4 = new Deltagande(erik, java) ;
        Deltagande d5 = new Deltagande(erik, electricCircuit) ;
        Deltagande d6 = new Deltagande(sara, calculus) ;

        List <Deltagande> allaDeltagande = new ArrayList<>() ;
        allaDeltagande.add(d1) ;
        allaDeltagande.add(d2) ;
        allaDeltagande.add(d3) ;
        allaDeltagande.add(d4) ;
        allaDeltagande.add(d5) ;
        allaDeltagande.add(d6) ;

        calculus.addTeacher(nadia);
        java.addTeacher(katya);
        electricCircuit.addTeacher(tanya);

        printStudents(allStudents, allaDeltagande);
    }

    public void printStudents(List <Student> allStudents, List <Deltagande> allaDeltagande){
        for (Student s : allStudents){
            System.out.println("Student: " + s.getName());
            for (Deltagande d : allaDeltagande) {
                if (d.getStudent() == s) {
                    System.out.println("Kurs: " + d.getCourse().getName());
                }
            }
            System.out.println("_________________________________");
        }
        System.out.println();
    }
}
