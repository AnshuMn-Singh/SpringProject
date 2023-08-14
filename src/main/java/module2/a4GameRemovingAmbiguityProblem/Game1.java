package module2.a4GameRemovingAmbiguityProblem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Game1 implements GameInterface {
    public void up(){
        System.out.println ("up 1" );
    }

    public void down(){
        System.out.println ("down 1" );
    }

    public void left(){
        System.out.println ("go left 1" );
    }

    public void right(){
        System.out.println ("go right 1" );
    }
}
