package module7RestApi.a6RestApiVersioning.a1urlVersioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/v1/person")
    public PersonV1 firstVersionPerson(){
        return new PersonV1("ans singh");
    }

    @GetMapping("/v2/person")
    public PersonV2 secondVersionPerson(){
        return new PersonV2(new Name("ans", "singh"));
    }
}
