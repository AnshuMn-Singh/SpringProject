package module3.a6XMLComfiguration.studentXML;

import org.springframework.beans.BeansException;
// import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentAppLauncher {
    public static void main( String[] args ){
        try (var context = new ClassPathXmlApplicationContext ( "config.xml" )) {
            System.out.println (context.getBean ( "Student" ) );
            System.out.println (context.getBean ( Student.class ).getStudentId() );
            System.out.println (context.getBean ( Student.class ).getStudentName () );
            context.getBean ( Student.class ).setStudentName ("anshuman");

            System.out.println (context.getBean ( Student.class ).getStudentName () );
        } catch (BeansException e) {
            e.printStackTrace();
        }

    }
}
