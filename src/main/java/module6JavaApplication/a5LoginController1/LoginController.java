package module6JavaApplication.a5LoginController1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private AuthenticationService authenticationService; // it will not take instatite object by itself, so we need to autowired this usning constructor

    public LoginController ( AuthenticationService authenticationService ) {
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
