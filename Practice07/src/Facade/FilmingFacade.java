package Facade;

public class FilmingFacade {

    private Camera camera = new Camera();
    private Light light = new Light();

    public void on() {
        camera.on();
        light.on();
    }

    public void tact() {
        System.out.println("Filming in progress...");
    }

    public void off() {
        camera.off();
        light.off();
    }

}
