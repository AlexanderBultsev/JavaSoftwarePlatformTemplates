package pristine.practice10;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Practice10Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        if (args.length == 0)
            throw new RuntimeException("Missing programmer type parameter");

        Programmer programmer = switch (args[0]) {
            case "junior" -> context.getBean(Junior.class);
            case "middle" -> context.getBean(Middle.class);
            case "senior" -> context.getBean(Senior.class);
            default -> throw new RuntimeException("Wrong programmer type parameter");
        };
        programmer.doCoding();
    }
}
