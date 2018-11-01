package Command;

public class Demo {

    public static void demo(){
        System.out.println("*** Command pattern ***");

        Executable cmd1 = new GoForward();
        Executable cmd2 = new GoLeft();
        Executable cmd3 = new GoRight();
        Executable cmd4 = new GoBackwards();

        Car car = new Car();
        car.manipulate(cmd1);
        car.manipulate(cmd2);
        car.manipulate(cmd3);
        car.manipulate(cmd4);
        car.manipulate();

        System.out.println();
    }
}
