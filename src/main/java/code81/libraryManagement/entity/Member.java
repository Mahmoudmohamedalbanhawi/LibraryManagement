package code81.libraryManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    private Long id ;
    private String name ;
    private String email;
    @Column(name = "member_ship_date")
    private String memberShipDate;
}
