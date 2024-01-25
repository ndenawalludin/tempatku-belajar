package service;

import entity.Todolist;
import repository.TodolistRepository;

public class TodolistServiceImpl implements TodolistService {

    private TodolistRepository todolistRepository;

    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    public void showAllTodolist() {
        Todolist[] todoLists = this.todolistRepository.getAllTodolist();

        for(int i = 0; i < todoLists.length; ++i) {
            Todolist todo = todoLists[i];
            int no = 1 + i;
            if (todo != null) {
                System.out.println(no + ". " + todo.getTodo());
            }
        }

    }

    public void addTodolist(String todo) {
        this.todolistRepository.addTodolist(todo);
        System.out.println("BERHASIL MENAMBAHKAN DATA : " + todo);
    }

    public void removeTodolist(Integer number) {
        boolean success = this.todolistRepository.removeTodolist(number);
        if (success){
            System.out.println("BERHASIL HAPUS DATA NOMOR " + number);
        } else {
            System.out.println("GAGAL HAPUS DATA NOMOR " + number);
        }
    }
}
