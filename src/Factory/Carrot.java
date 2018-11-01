package Factory;

public class Carrot extends Vegetable {
    public static final String TYPE = "CARROT";

    public Carrot(){
        System.out.println("Carrot initialized.");
    }

    @Override
    public String getColour() {
        return "Orange";
    }

    @Override
    public String getType() {
        return Carrot.TYPE;
    }
}
