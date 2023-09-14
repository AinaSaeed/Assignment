public class Tv {
    int no_of_channels;
    int resolution;
    int size;
    int usb_ports;
    int hdmi_ports;
    boolean BT_support;

    Tv(int noOfChannels, int resolution, int size, int usbPorts, int hdmiPorts, boolean btSupport){}
    public Tv(int no_of_channels, int resolution, byte size, byte usb_ports, byte hdmi_ports, boolean BT_support) {
        this.no_of_channels = no_of_channels;
        this.resolution = resolution;
        this.size = size;
        this.usb_ports = usb_ports;
        this.hdmi_ports = hdmi_ports;
        this.BT_support = BT_support;
    }

    public void power_On(){        System.out.println("tv is on");    }
    public void Power_Off(){        System.out.println("tv is off");  }
    public void change_Channel(){        System.out.println("channel is changed");    }
    public void volume_Up(){        System.out.println("volume is increased");    }
    public void volume_Down(){        System.out.println("volume is decreased ");    }
    public void change_setting(){        System.out.println("setting is changed");    }


}
