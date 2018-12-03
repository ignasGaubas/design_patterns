package Composite;

public class Number extends Expression {

    private final int num;

    public Number(int num){
        System.out.println(String.format("Number initialized: %d", num));
        this.num = num;
    }

    @Override
    public String toString() {
        return Integer.toString(this.num);
    }
}
