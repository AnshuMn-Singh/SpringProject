package module5SpringJdbcJPASpringJPA.a3SpringJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByauthor( String author);
    List<Course> findByfullName( String fullName);
}
