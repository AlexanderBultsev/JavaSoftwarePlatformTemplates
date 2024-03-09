package Practice07.Facade;

public class Main {

    public static void main(String[] args) {
        FilmingFacade filming = new FilmingFacade();
        filming.on();
        filming.tact();
        filming.off();
    }
}
