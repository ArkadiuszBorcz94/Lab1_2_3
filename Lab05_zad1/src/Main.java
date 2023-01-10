import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Tasks tasks=new Tasks();
        ToDoItem ToDoItem1 = new ToDoItem("Zadanie 1", LocalDate.of(2023,10,4),9);
        tasks.addToDoItem(0,ToDoItem1);
        ToDoItem ToDoItem2 = new ToDoItem("Zadanie 2", LocalDate.of(2023,11,3),8);
        tasks.addToDoItem(1,ToDoItem2);
        ToDoItem ToDoItem3 = new ToDoItem("Zadanie 3", LocalDate.of(2023,12,1),7);
        tasks.addToDoItem(2,ToDoItem3);

       ToDoItem retrieved =tasks.getToDoItem(2);

        System.out.println("NAME: "+retrieved.name+", DEADLINE: "+retrieved.deadLine+", PRIORITY: "+retrieved.priority);
        ToDoItem[] toDoItems=tasks.toDoItems;



    }

}