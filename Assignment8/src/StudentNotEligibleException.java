public class StudentNotEligibleException extends Exception{
    public StudentNotEligibleException(String s){

    };
    public  String getMessage(){
        System.out.println("Student is Not Eligible for admission");
        return null;

    };

}
