package module6JavaApplication.a5LoginController1;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean  isValidUserName = username.equalsIgnoreCase ( "ans" );
        boolean  isValidPassword = password.equalsIgnoreCase ( "a" );

        return isValidUserName && isValidPassword;
    }
}
