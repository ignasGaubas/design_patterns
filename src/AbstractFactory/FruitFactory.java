package AbstractFactory;

public class FruitFactory extends FoodFactory {

    public FruitFactory(){
        System.out.println("FruitFactory initialized.");
    }

    public Food getFood(String family, String type) {
        if (family == Fruit.FAMILY) {
            if (type == Apple.TYPE) {
                return new Apple();
            } else if (type == Banana.TYPE) {
                return new Banana();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
