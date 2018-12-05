package Interpreter;

public class OneExpression extends Expression {

    public OneExpression() {
        System.out.println("OneExpression initialized.");
    }

    @Override
    protected String one() {
        System.out.println("OneExpression: one.");
        return "I";
    }

    @Override
    protected String four() {
        System.out.println("OneExpression: four.");
        return "IV";
    }

    @Override
    protected String five() {
        System.out.println("OneExpression: five.");
        return "V";
    }

    @Override
    protected String nine() {
        System.out.println("OneExpression: nine.");
        return "IX";
    }

    @Override
    protected int multiplier() {
        System.out.println("OneExpression: multiplier.");
        return 1;
    }
}
