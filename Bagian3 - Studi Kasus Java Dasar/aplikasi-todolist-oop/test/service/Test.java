/**
 * CLASS INI UNTUK UNIT TEST
 */
package test.service;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;


public class Test {
    public static void main(String[] args) {
        addTodoList();
    }

    public static void addTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        System.out.println("BEFORE======");
        todolistService.addTodolist("I");
        todolistService.addTodolist("Love");
        todolistService.addTodolist("You");
        todolistService.addTodolist("So Much");
        todolistService.showAllTodolist();
        System.out.println("AFTER======");
        todolistService.removeTodolist(3);
        todolistService.showAllTodolist();
    }
}
