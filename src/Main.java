import Factory.*;
import singleton.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!\n");

        demo_singleton();

        demo_factory();
    }

    private static void demo_singleton(){
        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();

        if(singletonA == singletonB){
            System.out.println("singletonA and singletonB are same instance.");
        }else{
            System.out.println("singletonA and singletonB are different instances.");
        }

        System.out.println();
    }

    private static void demo_factory(){
        Factory factory = new VegetableFactory();

        Vegetable carrot = factory.createVegetable(Carrot.TYPE);
        Vegetable potato = factory.createVegetable(Potato.TYPE);

        System.out.printf("Carrot colour: %s, type: %s\n", carrot.getColour(), carrot.getType());
        System.out.printf("Potato colour: %s, type: %s\n", potato.getColour(), potato.getType());

        System.out.println();
    }
}
