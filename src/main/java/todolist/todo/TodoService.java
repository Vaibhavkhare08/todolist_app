package todolist.todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private List<ToDoEntity> todos = new ArrayList<>(
			
			   Arrays.asList(
					   new ToDoEntity(1, "Task 1","Summary","desc. 1"),
					   new ToDoEntity(2, "Task 2","Summary","desc. 2"),
					   new ToDoEntity(3, "Task 3","Summary","desc. 3")
					   )
			    
			);
	
	public List<ToDoEntity> GetAllToDos(){
		return todos;
	}

	public ToDoEntity getToDo(Integer id) {
		return todos.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
}
