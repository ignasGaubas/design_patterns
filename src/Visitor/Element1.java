package Visitor;

public class Element1 extends Element {

    public Element1() {
        System.out.println("Element1 initialized.");
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println(String.format("Element1 \"%s\" is accepting Visitor \"%s\".", this.getClass(), visitor.getClass()));
        visitor.visit(this);
    }
}
