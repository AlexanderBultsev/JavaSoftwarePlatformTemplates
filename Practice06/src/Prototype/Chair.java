package Prototype;

public class Chair implements Product, Copyable {

    int code;
    public Chair(int code) {
        this.code = code;
    }
    @Override
    public String getName() {
        return "Chair " + code;
    }

    @Override
    public Chair copy() {
        return new Chair(code);
    }
}
