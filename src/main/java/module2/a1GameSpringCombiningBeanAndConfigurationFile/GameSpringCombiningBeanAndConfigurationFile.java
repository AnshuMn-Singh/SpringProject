package module2.a1GameSpringCombiningBeanAndConfigurationFile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

// adding both bean adn configurations in same file
public class GameSpringCombiningBeanAndConfigurationFile {
    @Bean
    public GameInterface game ( ) {
        return new Game1 ( );
    }

    @Bean
    public GameRunner gameRunner ( ) {
        return new GameRunner ( game ( ) );
    }

    public static void main ( String[] args ) {
        var context = new AnnotationConfigApplicationContext ( GameSpringCombiningBeanAndConfigurationFile.class );

        context.getBean ( GameInterface.class ).up ( );
        context.getBean ( GameRunner.class ).run ( );
    }
}

