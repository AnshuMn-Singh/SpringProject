package module3.a4PreAndPostdestroyAppLauncher;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private SomeDependency someDependency;

    public SomeClass ( SomeDependency someDependency ) {
        this.someDependency = someDependency;
        System.out.println ("all dependency is ready" );
    }

    @PostConstruct
    public void inilitizer(){
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println ("cleanup" );
    }
}

@Component
class SomeDependency{
    public void getReady ( ) {
        System.out.println ("some logic is using SomeDependency" );
    }
}


@Configuration
@ComponentScan
public class PostConstructAndPreDestroyAppLauncher {
    public static void main ( String[] args ) {
        try (var context = new AnnotationConfigApplicationContext ( PostConstructAndPreDestroyAppLauncher.class )) {
            Arrays.stream ( context.getBeanDefinitionNames ()).forEach ( System.out::println );
        }
    }
}