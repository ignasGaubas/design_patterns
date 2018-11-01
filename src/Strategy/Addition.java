package Strategy;

public class Addition extends Operation{
    public Addition(){
        System.out.println("Addition initialized.");
    }

    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
