package Command;

public class GoBackwards implements Executable {

    public GoBackwards(){
        System.out.println("GoBackwards initialized.");
    }

    @Override
    public void execute() {
        System.out.println("GoBackwards command is executed.");
    }
}
