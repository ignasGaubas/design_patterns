package Factory;

public class VegetableFactory extends Factory {

    public VegetableFactory(){
        System.out.println("Vegetable factory initialized.");
    }

    @Override
    public Vegetable createVegetable(String type) {
        switch (type) {
            case Carrot.TYPE:
                return new Carrot();
            case Potato.TYPE:
                return new Potato();
            default:
                return null;
        }
    }
}
