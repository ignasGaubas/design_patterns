package Visitor;

public class VisitorA extends Visitor {

    public VisitorA() {
        System.out.println(String.format("VisitorA initialized."));
    }

    @Override
    public void visit(Element element) {
        System.out.println(String.format("Element \"%s\" is visiting VisitorA \"%s\".", element.getClass(), this.getClass()));
    }
}
