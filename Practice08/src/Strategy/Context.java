package Strategy;

public class Context {
    Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void sendRequest() {
        strategy.sendRequest();
    }
}
