package Bridge;

public class TV extends Device {

    public TV() {
        System.out.println("TV initialized.");
    }

    @Override
    public void plugCable() {
        System.out.println("TV plugged cable.");
    }

    @Override
    public void unplugCable() {
        System.out.println("TV unplugged cable.");
    }

    @Override
    public void switchOn() {
        System.out.println("TV switched on.");
    }

    @Override
    public void switchOff() {
        System.out.println("TV switched off.");
    }
}
