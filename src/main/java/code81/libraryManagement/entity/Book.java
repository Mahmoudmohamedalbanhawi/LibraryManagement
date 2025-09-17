package code81.libraryManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    private long id ;
    private String language ;
    private int publicationYear;
    private String isbn;
    private String edition;
    private String summary ;
    private String coverImage ;
    @ManyToMany
    private List<Author> authors;
    @ManyToOne
    private Publisher publisher;

    @ManyToMany
    private List<Category> categories;

}
