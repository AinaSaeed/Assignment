public class Action {
    public static void main(String[] args) {
        Tv tv = new Tv(10,120 , 2 , 3 , 2 , true);
        Remote remote = new Remote(tv);//object

        remote.power_On();
        remote.Power_Off();
        remote.change_Channel();
        remote.change_setting();
        remote.volume_Up();
        remote.volume_Down();
    }
}
