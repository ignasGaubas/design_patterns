package AbstractFactory;

public class Demo {
    public static void demo(){
        FoodFactory foodFactory = new FoodFactory();
        Food apple = foodFactory.getFood(Fruit.FAMILY, Apple.TYPE);
        Food banana = foodFactory.getFood(Fruit.FAMILY, Banana.TYPE);
        Food carrot = foodFactory.getFood(AbstractFactory.Vegetable.FAMILY, AbstractFactory.Carrot.TYPE);
        Food potato = foodFactory.getFood(AbstractFactory.Vegetable.FAMILY, AbstractFactory.Potato.TYPE);

        System.out.printf("Apple colour: %s, type: %s\n", apple.getColour(), apple.getType());
        System.out.printf("Banana colour: %s, type: %s\n", banana.getColour(), banana.getType());
        System.out.printf("Carrot colour: %s, type: %s\n", carrot.getColour(), carrot.getType());
        System.out.printf("Potato colour: %s, type: %s\n", potato.getColour(), potato.getType());

        System.out.println();
    }
}
