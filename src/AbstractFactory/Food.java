package AbstractFactory;

public abstract class Food {

    public Food(){
        System.out.println("Food initialized.");
    }

    public abstract String getColour();
    public abstract String getFamily();
    public abstract String getType();
}
