package AbstractFactory;

public class Banana extends Fruit {
    public static final String TYPE = "BANANA";

    public Banana(){
        System.out.println("Banana initialized.");
    }

    @Override
    public String getColour() {
        return "Yellow";
    }

    @Override
    public String getType() {
        return Banana.TYPE;
    }
}
