import javax.persistence.*;

@Entity
@Table(name = "TODOLIST")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String todo;
    private String status;
    private String priority;

    // Getters and setters
}