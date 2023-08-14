package module2.a2GameSpringUsingComponentsForObjects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// removing the object and asking to spring to add an object through auto wiring
@Configuration
@ComponentScan("module2.a2GameSpringUsingComponentsForObjects")
public class GameSpringUsingComponentsForObjects {
    @Bean
    public GameRunner gameRunner (GameInterface game ) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    public static void main ( String[] args ) {
        var context = new AnnotationConfigApplicationContext ( GameSpringUsingComponentsForObjects.class );

        context.getBean ( GameInterface.class ).up ( );
        context.getBean ( GameRunner.class ).run ( );
    }
}

