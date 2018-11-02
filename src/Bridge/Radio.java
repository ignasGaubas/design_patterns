package Bridge;

public class Radio extends Device {

    public Radio(){
        System.out.println("Radio initialized.");
    }

    @Override
    public void plugCable() {
        System.out.println("Radio plugged cable.");
    }

    @Override
    public void unplugCable() {
        System.out.println("Radion unplugged cable.");
    }

    @Override
    public void switchOn() {
        System.out.println("Radio switched on.");
    }

    @Override
    public void switchOff() {
        System.out.println("Radio switched off.");
    }
}
