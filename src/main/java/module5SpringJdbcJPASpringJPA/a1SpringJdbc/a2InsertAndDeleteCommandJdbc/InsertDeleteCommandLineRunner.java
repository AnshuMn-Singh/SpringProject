package module5SpringJdbcJPASpringJPA.a1SpringJdbc.a2InsertAndDeleteCommandJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class InsertDeleteCommandLineRunner implements CommandLineRunner {

    @Autowired
    private InsertDeleteJdbcRepository repository;

    @Override
    public void run ( String... args ) throws Exception {
        repository.insert ( new Course (1, "a", "b"));
        repository.insert ( new Course (2, "c", "d"));
        repository.insert ( new Course (2, "e", "f"));
        repository.insert ( new Course (3, "e", "f"));
        repository.insert ( new Course (4, "e", "f"));

        repository.delete ( 4);
    }
}
