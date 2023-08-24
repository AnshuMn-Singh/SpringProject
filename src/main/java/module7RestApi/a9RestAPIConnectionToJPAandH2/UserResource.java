package module7RestApi.a9RestAPIConnectionToJPAandH2;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import jakarta.validation.Valid;
import module7RestApi.a9RestAPIConnectionToJPAandH2.exception.UserNotFoundException;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {
    private UserDaoService userDaoService;

    public UserResource ( UserDaoService userDaoService ) {
        this.userDaoService = userDaoService;
    }

    @GetMapping("/a/users")
    public List<User> retreiveAllUsers(){
        return userDaoService.findAll ();
    }

    @GetMapping("/a/users/{id}")
    public EntityModel<User> retrieveUser( @PathVariable int id ) {
        User user =  userDaoService.findOne (id);
        if(user == null){
            throw new UserNotFoundException ("user is not found");
        }

        EntityModel<User> entityModel = EntityModel.of(user);

        WebMvcLinkBuilder link =  linkTo(methodOn(this.getClass()).retreiveAllUsers());
        entityModel.add(link.withRel("all-users"));

        return entityModel;
    }

//    @PostMapping("/users")
//    public ResponseEntity<User> createUser( @RequestBody User user){
//        userDaoService.save (user);
//        return ResponseEntity.created ( null ).build ();
//    }

    @PostMapping("/a/users")
    public ResponseEntity<User> createUser( @Valid @RequestBody User user) {
        User savedUser = userDaoService.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/a/users/{id}")
    public List<User>  deleteUser( @PathVariable int id){
        userDaoService.deleteUser (  id);
        return userDaoService.findAll ();
    }
}
