package module2.game1Spring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

// adding both bean adn configurations in same file
public class Game1Spring {
    @Bean
    public GameInterface game ( ) {
        return new Game1 ( );
    }

    @Bean
    public GameRunner gameRunner ( ) {
        return new GameRunner ( game ( ) );
    }

    public static void main ( String[] args ) {
        try (var context = new AnnotationConfigApplicationContext ( Game1Spring.class )) {
            context.getBean ( GameInterface.class ).up ( );
            context.getBean ( GameRunner.class ).run ( );
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}

