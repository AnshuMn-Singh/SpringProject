package module1.a2GameUsingInterface;

public class GameUsingInterface {
    public static void main ( String[] args ) {
        var obj1 = new Game1 ();
        var obj2 = new Game2 ();
        var obj3 = new Game3 ();

        var gameRunner1 = new GameRunner (obj1);
        var gameRunner2 = new GameRunner (obj2);
        var gameRunner3 = new GameRunner (obj3);

        gameRunner1.run();
        gameRunner2.run();
        gameRunner3.run();
    }
}


// it is a loose couple using interface, it is easy to change one from another

