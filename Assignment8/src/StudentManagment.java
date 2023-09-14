import java.util.ArrayList;

public class StudentManagment {
    ArrayList<StudentTest>list=new ArrayList<>();
    void  addStudents(StudentTest s) throws StudentNotEligibleException{
        if (s.marks >=80){
            list.add(s);
        }else {
            throw new  StudentNotEligibleException("Stdent is not eligible for admission");
        }
    }
    public void print(){
        for (StudentTest studentTest: list){
            System.out.println("Name : " +studentTest.name+ "Age :"
                    +studentTest.age+"Marks : " +studentTest.marks);
            return;
        }
    }



}
