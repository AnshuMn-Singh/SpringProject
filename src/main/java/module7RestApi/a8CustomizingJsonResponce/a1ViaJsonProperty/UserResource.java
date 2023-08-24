package module7RestApi.a8CustomizingJsonResponce.a1ViaJsonProperty;

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
    public List<User> retreiveAllUsers(){
        return userDaoService.findAll ();
    }

    @GetMapping("/users/{id}")
    public User retreiveUser( @PathVariable int id ) {
        User user =  userDaoService.findOne (id);
        if(user == null){
            throw new UserNotFoundException ("user is not found");
        }

        return user ;
    }
}
