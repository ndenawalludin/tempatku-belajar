package service;

import entity.Todolist;

public interface TodolistService {
    void showAllTodolist();

    void addTodolist(String todo);

    void removeTodolist(Integer number);
}
