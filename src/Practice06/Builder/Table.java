package Practice06.Builder;

public class Table implements Product {
    int code;
    public Table(int code) {
        this.code = code;
    }
    @Override
    public String getName() {
        return "Table " + code;
    }
}
