package repository;

import entity.Todolist;

public class TodolistRepositoryImpl implements TodolistRepository{

    private Todolist[] datas = new Todolist[10];

    @Override
    public Todolist[] getAllTodolist() {
        return datas;
    }

    @Override
    public void addTodolist(String todolist) {
        reSizeTodoList();

        //add toList
        for (int i = 0; i < datas.length; i++) {
            if (datas[i] == null){
                Todolist todo = new Todolist(todolist);
                datas[i] = todo;
                break;
            }
        }
    }

    @Override
    public boolean removeTodolist(Integer number) {
        if((number - 1) >= datas.length){
            return false;
        } else if (datas[number - 1] == null){
            return false;
        } else {
            Todolist[] temp = datas;
            datas = new Todolist[datas.length];
            for (int i = 0; i < datas.length; i++) {
                if (i + 1 == number){
                    continue;
                }else{
                    if (i != 0 && datas[(i-1)] == null){
                        datas[(i-1)] = temp[i];
                        continue;
                    }
                    datas[i] = temp[i];
                }
            }
            return true;
        }
    }

    private boolean isFull(){
        boolean isFull = true;
        for (int i = 0; i < datas.length; i++) {
            if (datas[i] == null) {
                isFull = false;
            }
        }
        return isFull;
    }

    private void reSizeTodoList(){
        //new string will be remove all value in list, we must add previous datas in temporary list
        if (isFull()){
            Todolist[] tempTodoList = datas;
            datas = new Todolist[datas.length * 2];
            for (int i = 0; i < tempTodoList.length; i++) {
                datas[i] = tempTodoList[i];
            }
        }
    }
}
