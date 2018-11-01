package Prototype;

public class Demo {
    public static void demo(){
        System.out.println("*** Prototype pattern ***");

        Car car1 = new Car(1, 2, 3, 4);
        Car car2 = (Car) car1.clone();
        Car car3 = (Car) car1.clone();

        System.out.printf("Car1 = %s\n", car1.toString());
        System.out.printf("Car2 = %s\n", car2.toString());
        System.out.printf("Car3 = %s\n", car3.toString());

        System.out.println();
    }
}
