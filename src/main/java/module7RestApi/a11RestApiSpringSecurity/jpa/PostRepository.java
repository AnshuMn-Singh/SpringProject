package module7RestApi.a11RestApiSpringSecurity.jpa;

import module7RestApi.a11RestApiSpringSecurity.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
