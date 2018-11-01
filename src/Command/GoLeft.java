package Command;

public class GoLeft implements Executable {

    public GoLeft(){
        System.out.println("GoLeft initialized.");
    }

    @Override
    public void execute() {
        System.out.println("GoLeft command is executed.");
    }
}
