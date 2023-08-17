package module5SpringJdbcJPASpringJPA.a3SpringJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringJpaRunner implements CommandLineRunner {

    @Autowired
    private SpringJpaRepository repository;

    @Override
    public void run ( String... args ) throws Exception {
        repository.save ( new Course (1, "a", "b"));
        repository.save ( new Course (2, "c", "d"));
        repository.save ( new Course (2, "e", "f"));
        repository.save ( new Course (3, "e", "f"));
        repository.save ( new Course (4, "e", "f"));

        repository.deleteById ( 4l);

        System.out.println ( "repository findById:" + repository.findById ( 2l ) );
        System.out.println ( "findByAuthor a: " + repository.findByauthor ( "b" ) );
        System.out.println ( "findByAuthor []: " + repository.findByauthor ( "" ) );

        System.out.println ( "findAll() = " + repository.findAll() );
        System.out.println ( "count () = " + repository.count () );

        System.out.println ( "findByfullName 'e' = " + repository.findByfullName ( "e" ) );
    }
}
