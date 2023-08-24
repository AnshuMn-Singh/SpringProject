package module7RestApi.a1HelloWorldBasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "hello-world")
    @ResponseBody
    public String helloWorld(){
        return "Hello World";
    }
}
