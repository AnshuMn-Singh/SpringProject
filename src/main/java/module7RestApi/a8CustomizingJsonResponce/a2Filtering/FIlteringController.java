package module7RestApi.a8CustomizingJsonResponce.a2Filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FIlteringController {

    @GetMapping("/filter")
    public SomeBean filtering(){
        return new SomeBean("value1", "value2", "value3");
    }

    @GetMapping("/filter-list")
    public List<SomeBean> listFiltering(){
        return Arrays.asList (new SomeBean("value1", "value2", "value3"),
                new SomeBean("value1", "value2", "value3"));
    }
}
