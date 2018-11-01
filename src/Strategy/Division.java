package Strategy;

public class Division extends Operation {
    public Division(){
        System.out.println("Division initialized.");
    }

    @Override
    public double calculate(double a, double b) {
        return a / b;
    }
}
