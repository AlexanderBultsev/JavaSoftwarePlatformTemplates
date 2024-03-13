package Practice08.Strategy;

public class Main {
    public static void main(String[] args) {
        Context context1 = new Context(new LocalStrategy());
        context1.sendRequest();
        Context context2 = new Context(new RemoteStrategy());
        context2.sendRequest();
    }
}
