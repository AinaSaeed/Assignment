public class InvalidStudentException extends Exception{
    InvalidStudentException(String s){

    }
    public String printMessage(){
        System.out.println("Invalid student Exception is thrown");
        return  null;
    }

    }
