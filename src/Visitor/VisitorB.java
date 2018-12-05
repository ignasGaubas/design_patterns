package Visitor;

public class VisitorB extends Visitor {

    public VisitorB() {
        System.out.println(String.format("VisitorB initialized."));
    }

    @Override
    public void visit(Element element) {
        System.out.println(String.format("Element \"%s\" is visiting VisitorB \"%s\".", element.getClass(), this.getClass()));
    }
}
