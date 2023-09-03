package a1Start;

import a1Start.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext ( "config.xml" );
        Student stud = (Student) context.getBean ( "demo.Student" );
        System.out.println (stud );
    }
}
