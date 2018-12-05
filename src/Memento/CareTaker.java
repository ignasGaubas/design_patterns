package Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> states;

    public CareTaker() {
        System.out.println("CareTaker initialized.");
        this.states = new ArrayList<>();
    }

    public void add(Memento stateMemento) {
        System.out.println("CareTaker add.");
        this.states.add(stateMemento);
    }

    public Memento get(int id) {
        System.out.println("CareTaker get.");
        return this.states.get(id);
    }
}
