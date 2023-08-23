package module6JavaApplication.a4LoginController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginDemoController {
    final Logger logger = LoggerFactory.getLogger(getClass ());

    @RequestMapping("loginDemo")
    public String gotoLogin( @RequestParam String name, ModelMap model ) {
        model.put ( "name", name );
        logger.warn ( "sc");
        logger.info ( name );
        logger.debug ( "Request param  is {}", name );
//        System.out.println ( "name = " + name );
        return "loginDemo";
    }
}
