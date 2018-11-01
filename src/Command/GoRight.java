package Command;

public class GoRight implements Executable {

    public GoRight(){
        System.out.println("GoRight initialized.");
    }

    @Override
    public void execute() {
        System.out.println("GoRight command is executed.");
    }
}
