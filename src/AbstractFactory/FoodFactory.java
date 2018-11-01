package AbstractFactory;

public class FoodFactory {

    public FoodFactory(){
        System.out.println("FoodFactory initialized.");
    }

    public Food getFood(String family, String type) {
        if (family == Vegetable.FAMILY) {
            if (type == Potato.TYPE) {
                return new Potato();
            } else if (type == Carrot.TYPE) {
                return new Carrot();
            } else {
                return null;
            }
        } else if (family == Fruit.FAMILY) {
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
