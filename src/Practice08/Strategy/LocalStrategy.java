package Practice08.Strategy;

public class LocalStrategy implements Strategy {

    @Override
    public void sendRequest() {
        System.out.println("Local request sent");
    }
}
