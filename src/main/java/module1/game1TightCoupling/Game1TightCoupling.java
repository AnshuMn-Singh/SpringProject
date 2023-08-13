package module1.game1TightCoupling;

public class Game1TightCoupling {
    public static void main ( String[] args ) {
//        var obj1 = new Game1 ();
        var obj2 = new Game2 ();

        var gameRunner = new GameRunner(obj2);
        gameRunner.run();
    }
}


// here it is highly coupled because every time we need to change too much to see changes
