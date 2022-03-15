package web.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column
    String name;
    @Column
    String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
