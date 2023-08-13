package module1.game2UsingInterface;

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
