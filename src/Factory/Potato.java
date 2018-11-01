package Factory;

public class Potato extends Vegetable {
    public static final String TYPE = "POTATO";

    public Potato(){
        System.out.println("Potato initialized.");
    }

    @Override
    public String getColour() {
        return "Brown";
    }

    @Override
    public String getType() {
        return Potato.TYPE;
    }
}
