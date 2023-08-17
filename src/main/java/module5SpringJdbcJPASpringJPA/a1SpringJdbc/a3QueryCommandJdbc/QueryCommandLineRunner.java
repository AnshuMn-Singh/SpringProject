package module5SpringJdbcJPASpringJPA.a1SpringJdbc.a3QueryCommandJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryCommandLineRunner implements CommandLineRunner {
    @Autowired
    private QueryJdbcRepository repository;

    @Override
    public void run ( String... args ) throws Exception {
        System.out.println ( "course = " + repository.findById ( 1 ) );
        System.out.println ( "course = " + repository.findById ( 3 ) );
//        System.out.println ( "course = " + repository.findAnObject ( 3 ) );

    }
}
