package AbstractFactory;

public abstract class FoodFactory {

    public FoodFactory(){
        System.out.println("FoodFactory initialized.");
    }

    public abstract Food getFood(String family, String type);
}
