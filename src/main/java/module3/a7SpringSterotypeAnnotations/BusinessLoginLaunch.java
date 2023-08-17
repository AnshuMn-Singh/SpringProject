package module3.a7SpringSterotypeAnnotations;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessLoginLaunch {
    public static void main ( String[] args ) {
        try (var context = new AnnotationConfigApplicationContext (BusinessLoginLaunch.class)) {
            System.out.println (context.getBean ( BusinessCalculationService.class ).findMax () );
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}
