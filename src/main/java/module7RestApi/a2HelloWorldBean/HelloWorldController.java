package module7RestApi.a2HelloWorldBean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "hello-world")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }
}
