public class Engine {
    private String type;
    private int horsePower;

    public Engine(String gasoline , int horsePower){
        this.type = gasoline;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public void display(){
        System.out.println(type);
        System.out.println(horsePower);
    }
    public void start()
    {
        System.out.println("engine is start");
    }
    public void stop()
    {
        System.out.println("engine is stop");
    }
    public void accelarate()
    {
        System.out.println("engine is accelarating");
    }

}
