package Strategy;

public class Demo {
    public static void demo(){
        System.out.println("*** Strategy pattern ***");

        double a = 20;
        double b = 10;

        Operation add = new Addition();
        Operation sub = new Subtraction();
        Operation mul = new Multiplication();
        Operation div = new Division();

        System.out.printf("Number a = %f\n", a);
        System.out.printf("Number b = %f\n", b);

        System.out.printf("Addition calculates: %f\n", add.calculate(a, b));
        System.out.printf("Subtraction calculates: %f\n", sub.calculate(a, b));
        System.out.printf("Multiplication calculates: %f\n", mul.calculate(a, b));
        System.out.printf("Division calculates: %f\n", div.calculate(a, b));

        System.out.println();
    }
}
