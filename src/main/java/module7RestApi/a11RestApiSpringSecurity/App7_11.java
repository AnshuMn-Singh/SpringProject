package module7RestApi.a11RestApiSpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

@SpringBootApplication
public class App7_11 {
    public static void main(String[] args) {
        SpringApplication.run(App7_11.class, args);
        ZonedDateTime now = ZonedDateTime.now().withZoneSameInstant(ZoneOffset.UTC);
        System.out.println("now = " + now);
    }
}
