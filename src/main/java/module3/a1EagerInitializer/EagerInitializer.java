package module3.a1EagerInitializer;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class EagerInitializer {
    public static void main ( String[] args ) {
        try (var context = new AnnotationConfigApplicationContext ( EagerInitializer.class )) {
            System.out.println (context.getBean ( EagerInitializer.class ) );
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}

