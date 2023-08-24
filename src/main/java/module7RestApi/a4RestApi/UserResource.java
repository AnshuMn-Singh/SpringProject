package module7RestApi.a4RestApi;

import jakarta.validation.Valid;
import module7RestApi.a4RestApi.exception.UserNotFoundException;
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

    @GetMapping("/users")
    public List<User> retreiveAllUsers(){
        return userDaoService.findAll ();
    }

    @GetMapping("/users/{id}")
    public User retreiveUser( @PathVariable int id ) {

        User user =  userDaoService.findOne (id);
        if(user == null){
            throw new UserNotFoundException ("user is not found");
        }
        return user;
    }

//    @PostMapping("/users")
//    public ResponseEntity<User> createUser( @RequestBody User user){
//        userDaoService.save (user);
//        return ResponseEntity.created ( null ).build ();
//    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User savedUser = userDaoService.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public List<User>  deleteUser( @PathVariable int id){
        userDaoService.deleteUser (  id);
        return userDaoService.findAll ();
    }
}
