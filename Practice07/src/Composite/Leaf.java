package Composite;

public class Leaf implements Component {
    String name;
    public Leaf(String name) {
        this.name = name;
    }
    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException("Leaf cannot add children");
    }
    @Override
    public void remove(Component c) {
        throw new UnsupportedOperationException("Leaf cannot remove children");
    }
    @Override
    public Component get(int i) {
        throw new UnsupportedOperationException("Leaf cannot get children");
    }
    @Override
    public void print(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("\t");
        }
        System.out.println(name);
    }
}
