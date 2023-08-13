package module1.game4UsingSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameBeans {

    @Bean
    public GameInterface game(){
        return new Game1 ();
    }

    @Bean
    public GameRunner gameRunner1(){
        return new GameRunner(game()); // for passing game method, we can call directly game method
    }

//    @Bean
//    public GameRunner gameRunner(GameInterface game){ //, or we can pass through parameter
//        return new GameRunner(game);
//    }
}