
public class Main {
    public static void main(String[] args) {
      StudentTest t1 = new StudentTest("Ahsan :",19,85.5);
        StudentTest t2 = new StudentTest("Aina",9,79.5);

        StudentManagment manage= new StudentManagment();
        try{
         manage.addStudents(t1);
            manage.addStudents(t2);
        }catch (StudentNotEligibleException e){
            System.out.println("Exception: "+e.getMessage());
        }
        manage.print();
    }
}