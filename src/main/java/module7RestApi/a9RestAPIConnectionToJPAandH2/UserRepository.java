package module7RestApi.a9RestAPIConnectionToJPAandH2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
