public class Student {

    String name;
    Department department;

    Student(String name, Department department) { //parametrized constructor
        this.name = name;
        this.department = department;
    }

    public Student(String name) {
        this.name = name;
    }
    void setDepartment(Department department){
        this.department = department;
    }
}
