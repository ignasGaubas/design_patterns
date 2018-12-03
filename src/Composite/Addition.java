package Composite;

public class Addition extends Expression {

    private final Expression left;
    private final Expression right;

    public Addition(Expression left, Expression right){
        System.out.println(String.format("Addition initialized: %s, %s.", left, right));
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.left.toString(), "+", this.right.toString());
    }
}
