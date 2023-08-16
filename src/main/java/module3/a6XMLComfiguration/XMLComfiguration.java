package module3.a6XMLComfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XMLComfiguration {
    public static void main ( String[] args ) {
        var context = new ClassPathXmlApplicationContext ("config.xml");
        Arrays.stream ( context.getBeanDefinitionNames () ).forEach ( System.out::println );
        System.out.println ( );

        System.out.println (context.getBean ( "name" ) );
        System.out.println (context.getBean ( "age" ) );

        System.out.println (context.getBean ( "game1" ) );
        context.getBean ( Game1.class ).left();
        context.getBean ( GameRunner.class ).run ();
    }
}
