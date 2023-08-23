package module6JavaApplication.a8ToDoDeleteTodo.a8ToDoValidations;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean  isValidUserName = username.equalsIgnoreCase ( "ans" );
        boolean  isValidPassword = password.equalsIgnoreCase ( "a" );

        return isValidUserName && isValidPassword;
    }
}
