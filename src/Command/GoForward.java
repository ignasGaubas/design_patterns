package Command;

public class GoForward implements Executable {

    public GoForward(){
        System.out.println("GoForward initialized.");
    }

    @Override
    public void execute() {
        System.out.println("GoForward command is executed.");
    }
}
