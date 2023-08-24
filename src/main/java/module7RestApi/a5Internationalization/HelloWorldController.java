package module7RestApi.a5Internationalization;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {
    private MessageSource messageSource;

    public HelloWorldController ( MessageSource messageSource ) {
        this.messageSource = messageSource;
    }

    @GetMapping("/hello")
    public String helloWorldInternationalized(){
        Locale locale = LocaleContextHolder.getLocale ();
        return messageSource.getMessage ( "good.morning.message", null, "Default Message", locale);
    }

    //2:
//		- Example: `en` - English (Good Morning)
//		- Example: `nl` - Dutch (Goedemorgen)
//		- Example: `fr` - French (Bonjour)
//		- Example: `de` - Deutsch (Guten Morgen)
}
