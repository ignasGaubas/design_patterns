package Interpreter;

public class TenExpression extends Expression {

    public TenExpression() {
        System.out.println("TenExpression initialized.");
    }

    @Override
    protected String one() {
        System.out.println("TenExpression: one.");
        return "X";
    }

    @Override
    protected String four() {
        System.out.println("TenExpression: four.");
        return "XL";
    }

    @Override
    protected String five() {
        System.out.println("TenExpression: five.");
        return "L";
    }

    @Override
    protected String nine() {
        System.out.println("TenExpression: nine.");
        return "XC";
    }

    @Override
    protected int multiplier() {
        System.out.println("TenExpression: multiplier.");
        return 10;
    }
}
