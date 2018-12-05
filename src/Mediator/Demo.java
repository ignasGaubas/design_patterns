package Mediator;

public class Demo {
    public static void demo() {
        System.out.println("*** Mediator pattern ***");

        Airport airport = new Airport();
        Plane p1 = new Plane(1, airport);
        Plane p2 = new Plane(2, airport);
        Plane p3 = new Plane(3, airport);

        p1.beginLand();
        p2.beginLand();
        p1.endLand();
        p2.beginLand();
        p2.endLand();
        p3.beginLand();
        p3.endLand();

        System.out.println();
    }
}
