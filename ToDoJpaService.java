import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoJpaService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodoById(int id) {
        return todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found with id " + id));
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodoStatus(int id, String status) {
        Todo todo = getTodoById(id);
        todo.setStatus(status);
        return todoRepository.save(todo);
    }

    public void deleteTodoById(int id) {
        todoRepository.deleteById(id);
    }
}