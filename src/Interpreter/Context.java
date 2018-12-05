package Interpreter;

public class Context {
    private int output;
    private String input;

    public Context(String input) {
        System.out.println(String.format("Context initialized: %s.", input));
        this.input = input;
        this.output = 0;
    }

    public int getOutput() {
        return this.output;
    }

    public String getInput() {
        return this.input;
    }

    public void setOutput(int value) {
        this.output = value;
    }

    public void setInput(String value) {
        this.input = value;
    }
}
