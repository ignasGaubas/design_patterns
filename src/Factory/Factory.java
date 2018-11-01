package Factory;

public abstract class Factory {

    public Factory(){
        System.out.println("Factory initialized.");
    }

    public abstract Vegetable createVegetable(String type);
}
