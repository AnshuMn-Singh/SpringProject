package module1.a1GameTightCoupling;

import module1.a2GameUsingInterface.GameInterface;

public class Game3 implements GameInterface {
    public void up(){
        System.out.println ("up 3" );
    }

    public void down(){
        System.out.println ("down 3" );
    }

    public void left(){
        System.out.println ("go left 3" );
    }

    public void right(){
        System.out.println ("go right 3" );
    }
}
