import java.util.Scanner;

public class AplikasiTodoList {
    public static String[] todoLists = new String[5];
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // todoLists[0] = "Belajar Java Fundamental";
        // todoLists[1] = "Review repository H1";
        // todoLists[2] = "Istirahat makan siang";
        // todoLists[3] = "Lanjut tracing";
        // todoLists[4] = "Fixing bug";

        // removeTodoList(1);

        showMenuTodoList();
    }


    /*
     * menampilkan todo list
     */
    public static void showTodoList(){

        for (int i = 0; i < todoLists.length; i++){
            String todo = todoLists[i];
            int no = 1 + i;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
        System.out.println();
    }


    /*
     * menambahkan todo list
     */
    public static void addTodoList(String todo){

        //iflist is full
        //first will be cek the list
        boolean isFull = true;
        for (int i = 0; i < todoLists.length; i++) {
            if (todoLists[i] == null) {
                isFull = false;
            }
        }

        if (isFull){
            //new string will be remove all value in list, we must add previous datas in temporary list
            String[] tempTodoList = todoLists;
            todoLists = new String[todoLists.length * 2];
            for (int i = 0; i < tempTodoList.length; i++) {
                todoLists[i] = tempTodoList[i];
            }
        }

        //add toList
        for (int i = 0; i < todoLists.length; i++) {
            if (todoLists[i] == null){
                todoLists[i] = todo;
                break;
            }
        }

    }


    /*
     * menghapus todo list
     */
    public static void removeTodoList(int index){

        if(index > todoLists.length){
            System.out.println("Data yang ingin anda hapus tidak tersedia");
        }

        String[] temp = todoLists;
        todoLists = new String[todoLists.length];
        for (int i = 0; i < todoLists.length; i++) {
            if (i + 1 == index){
                continue;
            }else{
                if (i != 0 && todoLists[(i-1)] == null){
                    todoLists[(i-1)] = temp[i];
                    continue;
                }
                todoLists[i] = temp[i];
            }
        }
        showTodoList();

    }


    /*
     * Menginputkan sebuah data
     */

     public static void inputData (){

         System.out.print("Nama : ");
         String name = scanner.nextLine();

         System.out.println("Hai " + name);

     }


     /**
      * Menampilkan view todo list
      */
      public static void showMenuTodoList(){

        String input;
        while (true){
            System.out.println("TODO LIST");
            showTodoList();
            System.out.println("MENU: ");
            System.out.println("============");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("X. Keluar");
            System.out.println("============");
            System.out.print("Silahkan pilih menu : ");
            input = scanner.nextLine();
    
            if (input.equals("1")){
                showMenuAddTodoList();
            }else if (input.equals("2")){
                showMenuRemoveTodoList();
            }else if (input.equalsIgnoreCase("x")){
                break;
            }else{
                System.out.println("Pilihan tidak dimengerti");
            }
        }

      }


      /**
       * Menampilkan view tambah todo list
       */
      public static void showMenuAddTodoList(){
        System.out.print("inputkan todo (input x jika batal) : ");
        String addTodo = scanner.nextLine();
        if(addTodo.equals("x")){
            return;
        }else {
            showTodoList();
            addTodoList(addTodo);
        }
      }


      /**
       * 
       * Menampilkan view remove todo list
       */
      public static void showMenuRemoveTodoList(){
        System.out.print("Nomor berapa yang ingin dihapus bray : ");
        int remove = scanner.nextInt();
        removeTodoList(remove);
        showTodoList();
      }
}
