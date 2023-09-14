import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Department {

    String dName;

    public Department(String dName) {
        this.dName = dName;
    }

    ArrayList <Student> students = new ArrayList<>();

    void addStudent(Student s){
        students.add(s);
    }

    void displayStudents(){
        System.out.println("Students in "+ dName +"Department");
        for(Student student : students)
            System.out.println("-"+student.name);
    }
}
