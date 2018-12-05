package Memento;

public class Demo {
    public static void demo() {
        System.out.println("*** Memento pattern ***");

        CareTaker ct = new CareTaker();
        StateOriginator so = new StateOriginator("State A");

        so.setState("State B");
        ct.add(so.getStateMemento());

        so.setState("State C");
        ct.add(so.getStateMemento());

        so.setState("State D");
        ct.add(so.getStateMemento());

        so.setStateMemento(ct.get(0));
        so.setStateMemento(ct.get(1));
        so.setStateMemento(ct.get(2));

        System.out.println();
    }
}
