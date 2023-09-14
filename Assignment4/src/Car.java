import java.lang.reflect.Array;
import java.util.Scanner;

public class Car{
    String colour;
    String model;
    int year;
    Engine carEngine = new Engine("diesel", 100);

    public Car(String colour, String model) throws InvalidPowerException {
        this.colour = colour;
        this.model = model;
    }
    public void start()
    {
        carEngine.start();
    }
    public void stop()
    {
        carEngine.stop();
    }
    public void accelarate()
    {
        carEngine.accelarate();
    }
    public void display(){
        System.out.println(colour);
        System.out.println(model);
        System.out.println(carEngine.getHorsePower());
    }
    void setYear(int year) throws InvalidPowerException{
        if(year < 0)
            throw  new InvalidPowerException(year + "is invalid");
        this.year = year;
    }


}
