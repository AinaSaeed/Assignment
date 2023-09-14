class Television {
    private int no_of_channels;
    private String resolution;
    private String size;
    private int usb_ports;
    private int hdmi_ports;
    private boolean BT_support;
    private boolean powerStatus;
    private int currentChannel;
    private int volume;

    public Television(int no_of_channels, String resolution, String size, int usb_ports, int hdmi_ports, boolean BT_support) {
        this.no_of_channels = no_of_channels;
        this.resolution = resolution;
        this.size = size;
        this.usb_ports = usb_ports;
        this.hdmi_ports = hdmi_ports;
        this.BT_support = BT_support;
        this.powerStatus = false;
        this.currentChannel = 1;
        this.volume = 50;
    }

    public void powerOn() {
        powerStatus = true;
        System.out.println("TV is powered on.");
    }

    public void powerOff() {
        powerStatus = false;
        System.out.println("TV is powered off.");
    }

    public void changeChannel(int channel) {
        if (powerStatus) {
            currentChannel = channel;
            System.out.println("Channel changed to " + channel);
        } else {
            System.out.println("TV is powered off. Cannot change channel.");
        }
    }

    public void volumeUp() {
        if (powerStatus && volume < 100) {
            volume++;
            System.out.println("Volume increased to " + volume);
        } else if (volume == 100) {
            System.out.println("Volume is already at maximum.");
        } else {
            System.out.println("TV is powered off. Cannot change volume.");
        }
    }

    public void volumeDown() {
        if (powerStatus && volume > 0) {
            volume--;
            System.out.println("Volume decreased to " + volume);
        } else if (volume == 0) {
            System.out.println("Volume is already at minimum.");
        } else {
            System.out.println("TV is powered off. Cannot change volume.");
        }
    }

    public void changeSetting() {
        if (powerStatus) {
            System.out.println("Open settings menu.");
        } else {
            System.out.println("TV is powered off. Cannot change settings.");
        }
    }
}

class Remote {
    private Television tv;

    public Remote(Television tv) {
        this.tv = tv;
    }

    public void powerOn() {
        tv.powerOn();
    }

    public void powerOff() {
        tv.powerOff();
    }

    public void changeChannel(int channel) {
        tv.changeChannel(channel);
    }

    public void volumeUp() {
        tv.volumeUp();
    }

    public void volumeDown() {
        tv.volumeDown();
    }

    public void changeSetting() {
        tv.changeSetting();
    }
}

public class Main {
    public static void main(String[] args) {
        Television television = new Television(100, "4K", "55 inches", 4, 3, true);
        Remote remote = new Remote(television);

        remote.powerOn();
        remote.changeChannel(5);
        remote.volumeUp();
        remote.volumeDown();
        remote.changeSetting();
        remote.powerOff();
    }
}
