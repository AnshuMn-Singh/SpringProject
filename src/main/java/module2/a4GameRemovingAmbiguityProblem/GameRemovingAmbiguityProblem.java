package module2.a4GameRemovingAmbiguityProblem;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// removing entire bean program and auto wiring from the class to a component
@Configuration
@ComponentScan("module2.a4GameRemovingAmbiguityProblem")
public class GameRemovingAmbiguityProblem {
    public static void main ( String[] args ) {
        try (var context = new AnnotationConfigApplicationContext ( GameRemovingAmbiguityProblem.class )) {
            context.getBean ( GameInterface.class ).up ( );
            context.getBean ( GameRunner.class ).run ( );
        } catch (BeansException e) {
            e.printStackTrace();
        }

    }
}

