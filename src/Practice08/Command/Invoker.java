package Practice08.Command;

public class Invoker {
    Command command;
    public Invoker(Command command) {
        this.command = command;
    }
    public void execute() {
        command.execute();
    }
}

class PrintChairName implements Command {
    Chair chair;
    public PrintChairName(Chair chair) {
        this.chair = chair;
    }

    @Override
    public void execute() {
        System.out.println(chair.getName());
    }
}