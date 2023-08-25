package module7RestApi.a11RestApiSpringSecurity.jpa;

import module7RestApi.a11RestApiSpringSecurity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
