package org.Arup.Control;

import java.util.Collection;

import org.Arup.Book.Book;
import org.Arup.CreateRequest.CreateBookRequest;
import org.Arup.Repo.BookRepository;
import org.Arup.View.BookView;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Collection<BookView> get() {
        return repository.findAll().stream().map(BookView::new).collect(Collectors.toList());
    }

    @PostMapping
    public ResponseEntity post(@RequestBody CreateBookRequest request) {
        repository.save(new Book(request.getName()));
        return ResponseEntity.ok().build();
    }
}