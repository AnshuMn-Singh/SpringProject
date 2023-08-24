package module7RestApi.a7RestApiHATEOAS;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {
    private UserDaoService userDaoService;

    public UserResource ( UserDaoService userDaoService ) {
        this.userDaoService = userDaoService;
    }

    @GetMapping("/users")
    public List<User> retreiveAllUsers ( ) {
        return userDaoService.findAll ( );
    }

    @GetMapping("/users/{id}")
    public EntityModel<User> retreiveUser ( @PathVariable int id ) {

        User user = userDaoService.findOne ( id );
        if ( user == null ) {
            throw new RuntimeException ( "user is not found" );
        }

        EntityModel<User> entityModel = EntityModel.of ( user );

        WebMvcLinkBuilder link = linkTo ( methodOn ( this.getClass ( ) ).retreiveAllUsers ( ) );
        entityModel.add ( link.withRel ( "all-users" ) );
        return entityModel;
    }
}
