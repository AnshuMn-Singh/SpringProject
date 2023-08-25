package module7RestApi.a10RestAPICreatingPostClass.jpa;

import module7RestApi.a10RestAPICreatingPostClass.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
