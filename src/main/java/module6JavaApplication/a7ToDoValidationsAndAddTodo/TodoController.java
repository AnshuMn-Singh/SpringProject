package module6JavaApplication.a7ToDoValidationsAndAddTodo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {
    private TodoService todoService;

    public TodoController ( TodoService todoService ) {
        this.todoService = todoService;
    }

    @RequestMapping("list-todos")
    public String listAllTodos( ModelMap model ){
        List<Todo> todos = todoService.findByUserName ( "ans" );
        model.put("todos", todos);
        return "listTodos";
    }
    
    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showNewTodoPage( ModelMap model ){
    	Todo todo = new Todo(5, "ans", "ans", LocalDate.now(), false);
    	model.put("todo", todo);
        return "todo";
    }
    
    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result ){
    	
    	if(result.hasErrors()) {
    		 return "todo";
    	}
    	todoService.addTodo((String)model.get("name"), todo.getDescription(), LocalDate.now(), false);
        return "redirect:list-todos";
    }
}
