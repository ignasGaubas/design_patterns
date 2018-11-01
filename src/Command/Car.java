package Command;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private List<Executable> commands;

    public Car(){
        System.out.println("Car initialized.");
        commands = new ArrayList<>();
    }

    public void manipulate(Executable command){
        System.out.println("New command added to Car's commands queue.");
        this.commands.add(command);
    }

    public void manipulate(){
        System.out.println("Starting to execute commands queue.");
        for(Executable cmd : commands){
            cmd.execute();
        }
    }
}
