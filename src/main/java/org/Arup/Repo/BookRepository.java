package org.Arup.Repo;

import java.util.UUID;

import org.Arup.Book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, UUID> {
}