package module7RestApi.a10RestAPICreatingPostClass.jpa;

import module7RestApi.a10RestAPICreatingPostClass.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
