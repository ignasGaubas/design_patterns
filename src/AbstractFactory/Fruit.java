package AbstractFactory;

public abstract class Fruit extends Food {
    public static final String FAMILY = "FRUIT";

    public Fruit(){
        System.out.println("Fruit initialized.");
    }

    public String getFamily(){
        return Fruit.FAMILY;
    }
}
