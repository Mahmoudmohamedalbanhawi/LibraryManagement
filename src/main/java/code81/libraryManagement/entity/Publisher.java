package code81.libraryManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @Data @AllArgsConstructor
public class Publisher {
    @Id
    @GeneratedValue
    private long id ;
    private String name ;
    private String address;

}
