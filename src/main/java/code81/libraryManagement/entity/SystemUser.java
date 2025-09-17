package code81.libraryManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "users")
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
