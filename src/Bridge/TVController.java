package Bridge;

public class TVController extends RemoteController {

    Device tv;

    public TVController(){
        System.out.println("TVController initialized.");
        this.tv = new TV();
    }

    @Override
    public void turnOn() {
        System.out.println("TVController turned on.");
        tv.plugCable();
        tv.switchOn();
    }

    @Override
    public void turnOff() {
        System.out.println("TVConteoller turned off.");
        tv.switchOff();
        tv.unplugCable();
    }
}
