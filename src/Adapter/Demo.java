package Adapter;

public class Demo {

    public static void demo(){
        System.out.println("*** Adapter pattern ***");

        Pet dog = new Dog();
        dog.walk();

        System.out.println();
    }
}
