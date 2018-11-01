package Factory;

public class Demo {
    public static void demo(){
        System.out.println("*** Factory pattern ***");

        Factory factory = new VegetableFactory();

        Vegetable carrot = factory.createVegetable(Carrot.TYPE);
        Vegetable potato = factory.createVegetable(Potato.TYPE);

        System.out.printf("Carrot colour: %s, type: %s\n", carrot.getColour(), carrot.getType());
        System.out.printf("Potato colour: %s, type: %s\n", potato.getColour(), potato.getType());

        System.out.println();
    }
}
