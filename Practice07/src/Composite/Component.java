package Composite;

public interface Component {
    void add(Component c);
    void remove(Component c);
    Component get(int i);
    void print(int indent);
}
