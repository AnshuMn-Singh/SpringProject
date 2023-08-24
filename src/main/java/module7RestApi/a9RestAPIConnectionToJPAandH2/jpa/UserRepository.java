package module7RestApi.a9RestAPIConnectionToJPAandH2.jpa;

import module7RestApi.a9RestAPIConnectionToJPAandH2.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
