package Bridge;

public class RadioController extends RemoteController {

    Device radio;

    public RadioController(){
        System.out.println("RadioController initialized.");
        this.radio = new Radio();
    }

    @Override
    public void turnOn() {
        System.out.println("RadioController turned on.");
        radio.plugCable();
        radio.switchOn();
    }

    @Override
    public void turnOff() {
        System.out.println("RadioController turned off.");
        radio.switchOff();
        radio.unplugCable();
    }
}
