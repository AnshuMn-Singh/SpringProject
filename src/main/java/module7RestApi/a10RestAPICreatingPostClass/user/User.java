package module7RestApi.a10RestAPICreatingPostClass.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "user1")
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 2, message = "name can't be less than 2 characters")
    private String name;

    @Past(message = "birthday should be in past")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Post> post;

    public User() {
    }

    public User (Integer id, String name, LocalDate birthDate ) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId ( ) {
        return id;
    }

    public void setId ( Integer id ) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public LocalDate getBirthDate ( ) {
        return birthDate;
    }

    public void setBirthDate ( LocalDate birthDate ) {
        this.birthDate = birthDate;
    }

    public List<Post> getPost() {
        return post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }

    @Override
    public String toString ( ) {
        return "User[ id=" + id + ", name='" + name + ", birthDate=" + birthDate + ']';
    }
}
