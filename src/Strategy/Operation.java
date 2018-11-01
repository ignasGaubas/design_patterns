package Strategy;

public abstract class Operation {

    public Operation(){
        System.out.println("Operation initialized.");
    }

    public abstract double calculate(double a, double b);
}
