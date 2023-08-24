package module7RestApi.a3HelloWorldPathVariable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "hello-world/{name}")
    public HelloWorldBean helloWorldBean( @PathVariable String name )   {
        // HelloWorldBean ("Hello World " + name)); // also
        return new HelloWorldBean (String.format ("Hello World %s", name));
    }
}

// http://localhost:8080/hello-world/as
//
// {
//"message": "Hello World as"
//}