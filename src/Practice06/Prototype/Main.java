package Practice06.Prototype;

public class Main {

    public static void main(String[] args) {
        Chair chair1 = new Chair(1);
        Chair chair2 = chair1.copy();
        System.out.println(chair1.getName());
        System.out.println(chair2.getName());
        System.out.println("--------------");
        chair2.code = 2;
        System.out.println(chair1.getName());
        System.out.println(chair2.getName());
    }
}
