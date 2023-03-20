package com.weCode.bookStore.repository;

import com.weCode.bookStore.model.Book;
import jakarta.persistence.Table;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;
@Table(name = "Book", schema = "PUBLIC")
public interface BookRepository extends CrudRepository<Book, UUID> {

    List<Book> findBooksByTitle(String title);
}
