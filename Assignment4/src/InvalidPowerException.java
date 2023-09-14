public class InvalidPowerException extends Exception {

    InvalidPowerException(String s){

    }

    public String getMessage(){
        System.out.println("Invalid year Exception is thrown");
        return null;
    }
}
