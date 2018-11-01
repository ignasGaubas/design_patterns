package Factory;

public abstract class Vegetable {

    public Vegetable(){
        System.out.println("Vegetable initialized.");
    }

    public abstract String getColour();
    public abstract String getType();
}
