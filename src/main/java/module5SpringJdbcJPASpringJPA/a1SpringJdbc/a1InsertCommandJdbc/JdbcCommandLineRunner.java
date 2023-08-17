package module5SpringJdbcJPASpringJPA.a1SpringJdbc.a1InsertCommandJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private JdbcRepository repository;

    @Override
    public void run ( String... args ) throws Exception {
        repository.insert ();
    }
}
