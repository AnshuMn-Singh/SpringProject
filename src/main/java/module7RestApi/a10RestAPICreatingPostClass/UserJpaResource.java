package module7RestApi.a10RestAPICreatingPostClass;

import jakarta.validation.Valid;
import module7RestApi.a10RestAPICreatingPostClass.jpa.PostRepository;
import module7RestApi.a10RestAPICreatingPostClass.jpa.UserRepository;
import module7RestApi.a10RestAPICreatingPostClass.user.Post;
import module7RestApi.a10RestAPICreatingPostClass.user.User;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserJpaResource {
    private UserRepository repository;
    private PostRepository postRepository;

    public UserJpaResource (UserRepository repository ) {
        this.repository = repository;
    }

    @GetMapping("/users")
    public List<User> retreiveAllUsers(){
        return repository.findAll ();
    }

    @GetMapping("/users/{id}")
    public EntityModel<User> retrieveUser( @PathVariable int id ) {
        Optional<User> user =  repository.findById(id);
        if(user.isEmpty()){
            throw new RuntimeException ("user is not found");
        }

        EntityModel<User> entityModel = EntityModel.of(user.get());

        WebMvcLinkBuilder link =  linkTo(methodOn(this.getClass()).retreiveAllUsers());
        entityModel.add(link.withRel("all-users"));

        return entityModel;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser( @Valid @RequestBody User user) {
        User savedUser = repository.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public List<User>  deleteUser( @PathVariable int id){
        repository.deleteById (  id);
        return repository.findAll ();
    }

    @GetMapping("/users/{id}/post")
    public List<Post>  retrivePostForUser(@PathVariable int id){
        Optional<User> user =  repository.findById(id);
        if(user.isEmpty()){
            throw new RuntimeException ("user is not found");
        }

        return user.get().getPost();
    }

    @PostMapping("/users/{id}/post")
    public ResponseEntity<Object> createPostForUser(@PathVariable int id, @Valid @RequestBody Post post){
        Optional<User> user =  repository.findById(id);
        if(user.isEmpty()){
            throw new RuntimeException ("user is not found");
        }

        post.setUser(user.get());
        Post savedPost = postRepository.save(post);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedPost.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
