package code81.libraryManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data @NoArgsConstructor @AllArgsConstructor
public class SystemUser {
    @Id
    @GeneratedValue
    private Long id ;
    @Column(unique = true)
    private String userName ;
    private String password ;
    private String role;
}
