public class CustomException extends Exception{
    public CustomException(String s){

    };
    public String getMessage(){
        System.out.println("null elements are not allowed");
        return  null;
    }
}
