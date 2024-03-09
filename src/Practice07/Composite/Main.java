package Practice07.Composite;

public class Main {
    public static void main(String[] args) {
        Composite content = new Composite("Content");
        Composite age1 = new Composite("Age I");
        age1.add(new Leaf("Chapter 1"));
        age1.add(new Leaf("Chapter 2"));
        Composite age2 = new Composite("Age II");
        age2.add(new Leaf("Chapter 3"));
        age2.add(new Leaf("Chapter 4"));
        content.add(age1);
        content.add(age2);
        content.print(0);
    }
}
