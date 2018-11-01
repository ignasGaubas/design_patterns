package AbstractFactory;

public abstract class Vegetable extends Food{
    public static final String FAMILY = "VEGETABLE";

    public Vegetable(){
        System.out.println("Vegetable initialized.");
    }

    public String getFamily(){
        return Vegetable.FAMILY;
    }
}
