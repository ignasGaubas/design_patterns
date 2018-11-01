package Strategy;

public class Subtraction extends Operation {
    public Subtraction(){
        System.out.println("Subtraction initialized.");
    }

    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}
