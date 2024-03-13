package Practice08.Command;

public class Main {
    public static void main(String[] args) {
        Command command = new PrintChairName(new Chair(122));
        Invoker invoker = new Invoker(command);
        invoker.execute();
    }
}
