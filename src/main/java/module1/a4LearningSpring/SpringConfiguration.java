package module1.a4LearningSpring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class SpringConfiguration {
    public static void main ( String[] args ) {
        try (
            // 1. Launch a spring context
        var context = new AnnotationConfigApplicationContext ( SpringBeanLearning.class )) {
            // 3: Retrieve Beans managed by Spring
            System.out.println ( context.getBean ( "name" ));
            System.out.println (context.getBean ( "age" ) );

            System.out.println (context.getBean ( "person" ) );
            System.out.println (context.getBean ( "person2MethodCall" ) );
            System.out.println (context.getBean ( "person2Parameter" ) );


            System.out.println (context.getBean ( "address2" ) );

            System.out.println (context.getBean ( "fullAddress" ) );

            System.out.println (context.getBean ( "fullAddress2MethodCall" ) );

//        System.out.println (context.getBean ( Address.class ) );
            System.out.println (context.getBean ( FullAddress.class ) );

            // ClassName.class will return the object of that class if only one exists,
            // if two exist, then it will get ambiguity, and give error for that

            Arrays.stream ( context.getBeanDefinitionNames ( )).forEach ( x -> System.out.println (x ) );
            // or
            Arrays.stream ( context.getBeanDefinitionNames ( )).forEach (System.out :: println);
        } catch (BeansException e) {
            e.printStackTrace();
        }

        // 2. Configure the things that we want Spring to manage - @Configuration
        // GameBasicConfiguration - @Configuration
        // name - @Bean

    }
}

