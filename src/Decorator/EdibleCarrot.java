package Decorator;

public class EdibleCarrot implements Edible {

    private final Carrot carrot;

    public EdibleCarrot(Carrot carrot){
        System.out.println("EdibleCarrot initialized.");

        this.carrot = carrot;
    }

    public void throwAt(String what) {
        carrot.throwAt(what);
        System.out.printf("You threw EdibleCarrot at %s.\n", what);
    }

    @Override
    public void eat() {
        System.out.println("You ate EdibleCarrot.");
    }
}
