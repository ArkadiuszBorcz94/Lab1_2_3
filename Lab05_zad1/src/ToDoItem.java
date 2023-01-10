import java.time.LocalDate;

public class ToDoItem {
        String name;
        LocalDate deadLine;
        int priority;

        ToDoItem(String name, LocalDate deadline, int priority){
            this.name=name;
            this.deadLine=deadline;
            this.priority=priority;
        }

}
