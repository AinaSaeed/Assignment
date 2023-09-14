import java.util.ArrayList;

public class University {

    String name = "MUET UET Jamshoro";

    ArrayList <Student> students = new ArrayList<>();

    Student getStudent(String skey){
        for (Student student: students)
            if (student.name.equals(skey))
                return student;
        return null;
    }
    ArrayList <Department> departments = new ArrayList<>();

    Department getDepartment(String dkey){
        for (Department department : departments)
            if (department.dName.equals(dkey))
                return department;
        return null;
    }
    public University(String[] sname , String[] dname) {
        for (String s : sname) {
            students.add(new Student(s));
        }
        for(int i = 0; i < sname.length ; i++){
            departments.add(new Department(dname[i]));
        }
    }

    void enrollment( Department d , Student s){
        d.addStudent(s);
        s.setDepartment(d); ;
    }
    public void display(){
        System.out.println("Departments :");
        for (Department department : departments) {
            System.out.println("- "+ department.dName);
        }
        System.out.println("Students:");
        for (Department department : departments) {
            System.out.println("-");
            department.displayStudents();
        }
    }


}
