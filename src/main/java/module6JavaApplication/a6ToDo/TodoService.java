package module6JavaApplication.a6ToDo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<> (  );

	private static int todosCount = 0;
	
    static {
        todos.add ( new Todo ( ++todosCount, "ans", "learn", LocalDate.now (), false ) );
        todos.add ( new Todo ( ++todosCount, "ans", "learn", LocalDate.now (), false ) );
        todos.add ( new Todo ( ++todosCount, "ans", "learn", LocalDate.now (), false ) );
    }

    public List<Todo> findByUserName(String username){
        return todos;
    }
    
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount,username,description,targetDate,done);
		todos.add(todo);
		System.out.println(todos);
	}
	
}
