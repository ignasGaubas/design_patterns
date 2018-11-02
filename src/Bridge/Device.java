package Bridge;

public abstract class Device {

    public Device(){
        System.out.println("Device initialized.");
    }

    public abstract void plugCable();
    public abstract void unplugCable();
    public abstract void switchOn();
    public abstract void switchOff();
}
