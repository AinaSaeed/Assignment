import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidPowerException {

    Car myCar=new  Car("White","Civic");
    Scanner in = new Scanner(System.in);
    int[] numbers = new int[5];
    myCar.start();
    myCar.stop();
        try{
            myCar.setYear(in.nextInt());
        }catch (InvalidPowerException e){
            e.getMessage();
        }

        try{
            numbers[8] = 67;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound exception is thrown");
        }
    myCar.accelarate();
       myCar.display();
    }

}