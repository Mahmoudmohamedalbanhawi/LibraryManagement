package code81.libraryManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class BorrowTransaction {
    private Long id ;
    @ManyToOne
    private Book book;
    @ManyToOne
    private Member member;
    private String borrowDate ;
    private String dueDate ;
    private String returnDate ;
    private String status;
}
