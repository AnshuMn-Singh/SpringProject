package module7RestApi.a6RestApiVersioning.a3RequestHeaderVersion;

import module7RestApi.a6RestApiVersioning.a1urlVersioning.Name;
import module7RestApi.a6RestApiVersioning.a1urlVersioning.PersonV1;
import module7RestApi.a6RestApiVersioning.a1urlVersioning.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping(path = "/person", headers = "X-API-VERSION=1")
    public PersonV1 firstVersionPersonRequestHeader(){
        return new PersonV1("ans singh");
    }

    @GetMapping(path = "/person", headers = "X-API-VERSION=2")
    public PersonV2 secondVersionPersonRequestHeader(){
        return new PersonV2(new Name ("ans", "singh"));
    }
}
