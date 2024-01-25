import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;
import view.TodolistView;

public class AplikasiTodoListV2 {
    public static void main(String[] args) {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistView.showTodolist();
    }
}
