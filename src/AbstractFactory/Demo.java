package AbstractFactory;

public class Demo {
    public static void demo(){
        FoodFactory vegetableFactory = new VegetableFactory();
        FoodFactory fruitFactory = new FruitFactory();

        Food apple = fruitFactory.getFood(Fruit.FAMILY, Apple.TYPE);
        Food banana = fruitFactory.getFood(Fruit.FAMILY, Banana.TYPE);
        Food carrot = vegetableFactory.getFood(Vegetable.FAMILY, Carrot.TYPE);
        Food potato = vegetableFactory.getFood(Vegetable.FAMILY, Potato.TYPE);

        System.out.printf("Apple colour: %s, type: %s\n", apple.getColour(), apple.getType());
        System.out.printf("Banana colour: %s, type: %s\n", banana.getColour(), banana.getType());
        System.out.printf("Carrot colour: %s, type: %s\n", carrot.getColour(), carrot.getType());
        System.out.printf("Potato colour: %s, type: %s\n", potato.getColour(), potato.getType());

        System.out.println();
    }
}
