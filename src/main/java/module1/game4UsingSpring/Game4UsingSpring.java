package module1.game4UsingSpring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Game4UsingSpring {
        public static void main ( String[] args ) {

            try (var context = new AnnotationConfigApplicationContext ( GameBeans.class)) {
                context.getBean ( GameInterface.class ).up ();
                context.getBean ( GameRunner.class ).run (); // it will give ambiguity because two game runners are there, so
            } catch (BeansException e) {
                e.printStackTrace();
            }
    }
}

