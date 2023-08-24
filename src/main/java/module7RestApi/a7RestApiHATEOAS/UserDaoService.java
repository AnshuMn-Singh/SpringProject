package module7RestApi.a7RestApiHATEOAS;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<> (  ) ;

    private static int userCount = 0;

    static {
        users.add ( new User (  ++userCount, "a", LocalDate.now ().minusYears ( 30 ) ));
        users.add ( new User (  ++userCount, "b", LocalDate.now ().minusYears ( 20 ) ));
        users.add ( new User (  ++userCount, "c", LocalDate.now ().minusYears ( 10 ) ));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne( int id){
        Predicate<? super User> predicate = user -> user.getId ().equals ( id );
        return users.stream ().filter ( predicate ).findFirst ().orElse ( null );
    }
}
