package Bridge;

public class Demo {
    public static void demo() {
        System.out.println("*** Bridge pattern ***");

        RemoteController cntrlr1 = new TVController();
        cntrlr1.turnOn();
        cntrlr1.turnOff();

        RemoteController cntrlr2 = new RadioController();
        cntrlr2.turnOn();
        cntrlr2.turnOff();

        System.out.println();
    }
}
