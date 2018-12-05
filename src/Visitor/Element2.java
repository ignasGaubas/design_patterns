package Visitor;

public class Element2 extends Element {

    public Element2() {
        System.out.println("Element2 initialized.");
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println(String.format("Element2 \"%s\" is accepting Visitor \"%s\".", this.getClass(), visitor.getClass()));
        visitor.visit(this);
    }
}
