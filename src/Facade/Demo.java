package Facade;

public class Demo {
    public static void demo() {
        System.out.println("*** Facade pattern ***");

        House house = new House();
        house.cleanRats();
        house.setUpAlarm();
        house.prepareDinner();

        System.out.println();
    }
}
