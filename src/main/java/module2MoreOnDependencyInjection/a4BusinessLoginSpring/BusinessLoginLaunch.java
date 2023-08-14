package module2MoreOnDependencyInjection.a4BusinessLoginSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BusinessLoginLaunch {
    public static void main ( String[] args ) {
        var context = new AnnotationConfigApplicationContext (BusinessCalculationService.class);

        System.out.println (context.getBean ( BusinessCalculationService.class ).findMax () );
    }
}
