import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {
    String[]name={"ahmed","ali","Ahsan"};
    String []depart={"cs","ce","sw"};

    University muet= new University(name, depart);

    Department d1 = muet.getDepartment("cs");
    Department d2 = muet.getDepartment("ce");

    Student s1 = new Student("ahmed");
    Student s2 = new Student("ali");

    muet.enrollment(d1 , s1);
    muet.enrollment(d2 , s2);

    muet.display();
    }
}