package module5SpringJdbcJPASpringJPA.a1SpringJdbc.a3QueryCommandJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QueryJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String SELECT_QUERY = "SELECT * FROM course where id = ?;";

    public List<Course> findById( long id){
       return springJdbcTemplate.query(SELECT_QUERY, new BeanPropertyRowMapper<>( Course.class), id);
    }

    public Course findAnObject( long id){
//        return springJdbcTemplate.queryForList (SELECT_QUERY, Course.class); // for one column only
        return springJdbcTemplate.queryForObject (SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id); // for one row only
    }
}
