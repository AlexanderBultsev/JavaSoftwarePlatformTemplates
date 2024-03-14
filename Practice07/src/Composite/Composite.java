package Composite;

import java.util.ArrayList;

public class Composite implements Component {
    ArrayList<Component> children;
    String name;

    public Composite(String name) {
        children = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component get(int i) {
        return children.get(i);
    }

    @Override
    public void print(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("\t");
        }
        System.out.println(name);
        for (Component c : children) {
            c.print(indent + 1);
        }
    }
}
