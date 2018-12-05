package Memento;

public class Memento {
    private String state;

    public Memento(String state) {
        System.out.println("Memento initialized.");
        this.state = state;
    }

    public String getState() {
        System.out.println("Memento getState.");
        return this.state;
    }
}
