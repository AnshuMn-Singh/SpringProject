package module2MoreOnDependencyInjection.a3ConstructorInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
    Dependency1 dependency1;
    Dependency2 dependency2;

//    @Autowired // only for constructor dependency injection autowired annotation is not mandatory
    public YourBusinessClass ( Dependency1 dependency1, Dependency2 dependency2 ) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    @Override
    public String toString ( ) {
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1{}

@Component
class Dependency2{}

@Configuration
@ComponentScan
public class ConstructorDependencyInjection {
    public static void main ( String[] args ) {
        var context = new AnnotationConfigApplicationContext ( ConstructorDependencyInjection.class );

        System.out.println (context.getBean ( YourBusinessClass.class ) );
//        Arrays.stream(context.getBeanDefinitionNames ()).forEach ( System.out::println );
    }
}

