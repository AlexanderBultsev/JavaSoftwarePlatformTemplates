package Practice08.Strategy;

public class Context {
    Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void sendRequest() {
        strategy.sendRequest();
    }
}
