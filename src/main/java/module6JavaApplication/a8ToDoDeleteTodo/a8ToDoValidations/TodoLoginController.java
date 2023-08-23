	package module6JavaApplication.a8ToDoDeleteTodo.a8ToDoValidations;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoLoginController {
    private AuthenticationService authenticationService;

    public TodoLoginController ( AuthenticationService authenticationService ) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLogin() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelecome(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if(authenticationService.authenticate ( name, password )){
            model.put ( "name", name );
            return "welcome";
        }
        model.put ( "errorMessage", "Invalid Credential" );
        return "login";
    }
}
