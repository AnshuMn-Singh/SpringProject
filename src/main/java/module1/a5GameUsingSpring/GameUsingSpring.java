package module1.a5GameUsingSpring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameUsingSpring {
    public static void main ( String[] args ) {
        try (var context = new AnnotationConfigApplicationContext ( GameBeans.class )) {
            context.getBean ( GameInterface.class ).up ( );
            context.getBean ( GameRunner.class ).run ( ); // it will give ambiguity because two game runners are there, so
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}

