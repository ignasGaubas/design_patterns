package Bridge;

public abstract class RemoteController {

    public RemoteController(){
        System.out.println("RemoteController initialized.");
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
