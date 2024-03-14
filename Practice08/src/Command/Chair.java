package Command;

public class Chair implements Product {
    int code;
    public Chair(int code) {
        this.code = code;
    }
    @Override
    public String getName() {
        return "Chair " + code;
    }
}
