package module7RestApi.a6RestApiVersioning.a2RequestParameterVersioning;

import module7RestApi.a6RestApiVersioning.a1urlVersioning.Name;
import module7RestApi.a6RestApiVersioning.a1urlVersioning.PersonV1;
import module7RestApi.a6RestApiVersioning.a1urlVersioning.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 firstVersionPersonRequestParameter(){
        return new PersonV1("ans singh");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 secondVersionPersonRequestParameter(){
        return new PersonV2(new Name ("ans", "singh"));
    }
}
