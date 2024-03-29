package module7RestApi.a8CustomizingJsonResponce.a1ViaJsonProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class User {
    private Integer id;

    @JsonProperty("user")
    @Size(min = 2, message = "name can't be less than 2 characters")
    private String name;

    @JsonProperty("birth_date")
    @Past(message = "birthday should be in past")
    private LocalDate birthDate;

    public User ( Integer id, String name, LocalDate birthDate ) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId ( ) {
        return id;
    }

    public LocalDate getBirthDate ( ) {
        return birthDate;
    }

    public void setBirthDate ( LocalDate birthDate ) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString ( ) {
        return "User[ id=" + id + ", name='" + name + ", birthDate=" + birthDate + ']';
    }
}
