package repository;

import entity.Todolist;

public interface TodolistRepository {

    Todolist[] getAllTodolist();

    void addTodolist(String todolist);

    boolean removeTodolist(Integer number);
}
