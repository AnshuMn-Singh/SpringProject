package module1.game1TightCoupling;

public class GameRunner {
    Game2 game;
    public GameRunner (Game2 game ) {
        this.game = game;
    }

    public void run(){
        game.up ();
        game.down ();
        game.left ();
        game.right ();
    }
}
