package Adapter;

public class Dog implements Pet {

    private final Wolf wolf;

    public Dog(){
        System.out.println("Dog initialized.");
        this.wolf = new Wolf();
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking.");
        this.wolf.go();
    }
}
