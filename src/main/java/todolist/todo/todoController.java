package todolist.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todoController {

	@Autowired
	private TodoService todoService; 
	
	@RequestMapping("/todos")
	public List<ToDoEntity> GetAllToDos(){
		return todoService.GetAllToDos();
	}
	
	@RequestMapping("todos/{id}")
	public todo GetToDo (@PathVariable Integer id) {
		return todoService.getToDo(id);
	}
	
	
}