package Composite;

public class Demo {
    public static void demo() {
        System.out.println("*** Composite pattern ***");

        Expression exp1 = new Number(1);
        Expression exp2 = new Number(2);
        Expression exp3 = new Addition(exp1, exp2);

        System.out.println(String.format("Exp1: \"%s\"", exp1.toString()));
        System.out.println(String.format("Exp2: \"%s\"", exp2.toString()));
        System.out.println(String.format("Exp3: \"%s\"", exp3.toString()));

        System.out.println();
    }
}
