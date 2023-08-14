package module2.a4GameRemovingAmbiguityProblem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("UsingGame2")
public class Game2  implements GameInterface {
    public void up(){
        System.out.println ("up 2" );
    }

    public void down(){
        System.out.println ("down 2" );
    }

    public void left(){
        System.out.println ("go left 2" );
    }

    public void right(){
        System.out.println ("go right 2" );
    }
}
