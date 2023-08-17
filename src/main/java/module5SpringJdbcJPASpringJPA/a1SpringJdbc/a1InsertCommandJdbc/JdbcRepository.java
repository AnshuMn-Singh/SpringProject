package module5SpringJdbcJPASpringJPA.a1SpringJdbc.a1InsertCommandJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                insert into course (id, name, author)
                values(1, 'ans','singh');
            """;

    public void insert(){
        springJdbcTemplate.update ( INSERT_QUERY );
    }
}
