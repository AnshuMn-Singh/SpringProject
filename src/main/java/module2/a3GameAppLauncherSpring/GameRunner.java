package module2.a3GameAppLauncherSpring;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GameInterface game;

    public GameRunner ( GameInterface game ) {
        this.game = game;
    }

    public void run(){
        game.up ();
        game.down ();
        game.left ();
        game.right ();
    }
}
