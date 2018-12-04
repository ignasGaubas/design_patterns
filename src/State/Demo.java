package State;

public class Demo {
    public static void demo() {
        System.out.println("*** State pattern ***");

        Soldier soldier = new Soldier();
        soldier.attack();

        soldier.sneak();
        soldier.attack();

        soldier.getShot();
        soldier.attack();

        soldier.heal();
        soldier.attack();

        System.out.println();
    }
}
