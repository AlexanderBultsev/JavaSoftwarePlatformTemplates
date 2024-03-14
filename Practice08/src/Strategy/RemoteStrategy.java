package Strategy;

public class RemoteStrategy implements Strategy {

    @Override
    public void sendRequest() {
        System.out.println("Remote request sent");
    }
}
