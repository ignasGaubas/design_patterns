package Strategy;

public class Multiplication extends Operation {
    public Multiplication(){
        System.out.println("Multiplication initialized.");
    }

    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
