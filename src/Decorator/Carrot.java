package Decorator;

public class Carrot {

    public Carrot(){
        System.out.println("Carrot initialized.");
    }

    public void throwAt(String what){
        System.out.printf("You threw Carrot at %s.\n", what);
    }
}
