package org.Arup.Book;





import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "books")
public class Book {	
	@Id
    private UUID id; 
    private String name; 
    private Book() { }
 
    public Book(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }
    public UUID getId() { return id; }
	public void setId(UUID id) { this.id = id; }
	public String getName() {return name; }
	public void setName(String name) { this.name = name; }
	
}