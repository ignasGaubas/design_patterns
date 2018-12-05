package Visitor;

public class Demo {
    public static void demo() {
        System.out.println("*** Visitor pattern ***");

        Visitor v1 = new VisitorA();
        Visitor v2 = new VisitorB();

        Element e1 = new Element1();
        Element e2 = new Element2();

        e1.accept(v1);
        e1.accept(v2);

        e2.accept(v1);
        e2.accept(v2);

        System.out.println();
    }
}
