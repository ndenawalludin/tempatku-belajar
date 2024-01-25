package test.view;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;
import view.TodolistView;

public class TodoListViewTest {
    public static void main(String[] args) {
//        testShowTodoList();
//        testAddTodoList();
        testRemoveTodoList();
    }


    public static void testShowTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodolist("Belajar Java Dasar");
        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Classes");



        todolistView.showTodolist();

    }

    public static void testAddTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistView.addTodolist();

    }

    public static void testRemoveTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodolist("Belajar Java Dasar");
        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Classes");



        todolistService.showAllTodolist();
        todolistView.removeTodolist();
        todolistService.showAllTodolist();

    }
}
