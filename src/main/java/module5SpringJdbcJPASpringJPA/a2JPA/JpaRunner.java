package module5SpringJdbcJPASpringJPA.a2JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JpaRunner implements CommandLineRunner {

    @Autowired
    private JpaRepository jpaRepository;

    @Override
    public void run ( String... args ) throws Exception {
        jpaRepository.insert ( new Course (1, "a", "b"));
        jpaRepository.insert ( new Course (2, "c", "d"));
        jpaRepository.insert ( new Course (2, "e", "f"));
        jpaRepository.insert ( new Course (3, "e", "f"));
        jpaRepository.insert ( new Course (4, "e", "f"));

        jpaRepository.deleteById ( 4);

        System.out.println ( "jpaRepository:" + jpaRepository.findById ( 2 ) );
    }
}
