package AbstractFactory;

public class Apple extends Fruit {
    public static final String TYPE = "APPLE";

    public Apple(){
        System.out.println("Apple initialized.");
    }

    @Override
    public String getColour() {
        return "Red";
    }

    @Override
    public String getType() {
        return Apple.TYPE;
    }
}
