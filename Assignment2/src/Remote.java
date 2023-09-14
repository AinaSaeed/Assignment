public class Remote {
    Tv tv = null;
    Remote(Tv tv){
        this.tv = tv;
    }
    public void power_On(){ tv.power_On(); }
    public void Power_Off(){ tv.Power_Off();}
    public void change_Channel(){ tv.change_Channel();}
    public void volume_Up(){tv.volume_Up();}
    public void volume_Down(){ tv.volume_Down();}
    public void change_setting(){ tv.change_setting();}
}
