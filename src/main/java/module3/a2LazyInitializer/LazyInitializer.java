package module3.a2LazyInitializer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class LazyInitializer {
    public static void main ( String[] args ) {
        var context = new AnnotationConfigApplicationContext ( LazyInitializer.class );
        context.getBean ( ClassB.class).doSomething();
    }
}

