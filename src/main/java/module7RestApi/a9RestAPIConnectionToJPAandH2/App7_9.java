package module7RestApi.a9RestAPIConnectionToJPAandH2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

@SpringBootApplication
public class App7_9 {
    public static void main ( String[] args ) {
        SpringApplication.run ( App7_9.class, args );
        System.out.println("TimeZone.getTimeZone(\"UTC\") = " + Date.from(Instant.now()).getTime());
    }
}
