package Interpreter;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void demo() {
        System.out.println("*** Interpreter pattern ***");

        String roman = "MCMXXVIII";
        Context context = new Context(roman);

        List<Expression> expressions = new ArrayList<>();
        expressions.add(new ThousandExpression());
        expressions.add(new HundredExpression());
        expressions.add(new TenExpression());
        expressions.add(new OneExpression());

        for (Expression exp : expressions) {
            exp.interpret(context);
        }

        System.out.println(String.format("%s = %d", roman, context.getOutput()));

        System.out.println();
    }
}
