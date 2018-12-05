package Interpreter;

public class HundredExpression extends Expression {

    public HundredExpression() {
        System.out.println("HundredExpression initialized.");
    }

    @Override
    protected String one() {
        System.out.println("HundredExpression: one.");
        return "C";
    }

    @Override
    protected String four() {
        System.out.println("HundredExpression: four.");
        return "CD";
    }

    @Override
    protected String five() {
        System.out.println("HundredExpression: five.");
        return "D";
    }

    @Override
    protected String nine() {
        System.out.println("HundredExpression: nine.");
        return "CM";
    }

    @Override
    protected int multiplier() {
        System.out.println("HundredExpression: multiplier.");
        return 100;
    }
}
