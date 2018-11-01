package Decorator;

public class Demo {
    public static void demo() {
        System.out.println("*** Decorator pattern ***");

        Carrot carrot = new Carrot();

        carrot.throwAt("wall");

        EdibleCarrot edibleCarrot = new EdibleCarrot(carrot);
        edibleCarrot.throwAt("wall");
        edibleCarrot.eat();

        System.out.println();
    }
}
