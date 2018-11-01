package AbstractFactory;

public class VegetableFactory extends FoodFactory{

    public VegetableFactory(){
        System.out.println("VegetableFactory initialized.");
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
        } else {
            return null;
        }
    }
}
