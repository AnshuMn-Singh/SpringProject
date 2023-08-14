package module2.a3GameAppLauncherSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// removing entire bean program and auto wiring from the class to a component
@Configuration
@ComponentScan("module2.a3GameAppLauncherSpring")
public class GameAppLauncherSpring {
    public static void main ( String[] args ) {
        var context = new AnnotationConfigApplicationContext ( GameAppLauncherSpring.class );

        context.getBean ( GameInterface.class ).up ( );
        context.getBean ( GameRunner.class ).run ( );
    }
}

