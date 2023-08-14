package module1.a2GameUsingInterface;

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
