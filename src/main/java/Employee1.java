import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "designation")
    String designation;
}
