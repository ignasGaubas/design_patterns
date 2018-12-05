package Memento;

public class StateOriginator {
    private String state;

    public StateOriginator(String state) {
        System.out.println(String.format("StateOriginator initialized \"%s\".", state));
        this.state = state;
    }

    public void setState(String state) {
        System.out.println(String.format("StateOriginator setState \"%s\".", state));
        this.state = state;
    }

    public Memento getStateMemento() {
        System.out.println("StateOriginator getStateMemento.");
        return new Memento(this.state);
    }

    public void setStateMemento(Memento stateMemento) {
        this.state = stateMemento.getState();
        System.out.println(String.format("StateOriginator setStateMemento \"%s\".", this.state));
    }
}
