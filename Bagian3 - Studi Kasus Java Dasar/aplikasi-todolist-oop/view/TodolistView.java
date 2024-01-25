package view;

import service.TodolistService;
import util.InputUtil;

public class TodolistView {


    private TodolistService todolistService;

    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    public void showTodolist(){
        while (true){
            System.out.println("TODO LIST");
            todolistService.showAllTodolist();
            System.out.println("MENU: ");
            System.out.println("============");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("X. Keluar");
            System.out.println("============");
            System.out.print("Silahkan pilih menu : ");
            String input = InputUtil.inputData();

            if (input.equals("1")){
                addTodolist();
            }else if (input.equals("2")){
                removeTodolist();
            }else if (input.equalsIgnoreCase("x")){
                break;
            }else{
                System.out.println("Pilihan tidak dimengerti");
            }
        }

    }

    public void addTodolist(){
        System.out.print("inputkan todo (input x jika batal) : ");
        String addTodo = InputUtil.inputData();
        if(addTodo.equals("x")){
            return;
        }else {
            todolistService.addTodolist(addTodo);
        }
    }

    public void removeTodolist(){
        while (true){
            System.out.print("Nomor berapa yang ingin dihapus bray : ");
            String remove = InputUtil.inputData();
            if (isNumeric(remove)){
                todolistService.removeTodolist(Integer.valueOf(remove));
                break;
            }else {
                System.out.println("SALAH INPUT BRAY!!!");
            }
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
