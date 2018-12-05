package Interpreter;

public class ThousandExpression extends Expression {

    public ThousandExpression() {
        System.out.println("ThousandExpression initialized.");
    }

    @Override
    protected String one() {
        System.out.println("ThousandExpression: one.");
        return "M";
    }

    @Override
    protected String four() {
        System.out.println("ThousandExpression: four.");
        return " ";
    }

    @Override
    protected String five() {
        System.out.println("ThousandExpression: five.");
        return " ";
    }

    @Override
    protected String nine() {
        System.out.println("ThousandExpression: nine.");
        return " ";
    }

    @Override
    protected int multiplier() {
        System.out.println("ThousandExpression: multiplier.");
        return 1000;
    }
}
