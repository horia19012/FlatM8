package FlatM8.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(unique = false)
    private String name;
    @Column(unique = true)
    private String username;
    @Column
    private String password;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String phone;
    @Column(unique = true)
    private String description;

    public User(String username, String password, String email, String phone, String description) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.description = description;
    }
}
