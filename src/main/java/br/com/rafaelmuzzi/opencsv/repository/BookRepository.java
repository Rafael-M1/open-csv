package br.com.rafaelmuzzi.opencsv.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.rafaelmuzzi.opencsv.model.Book;

@Repository
public class BookRepository {

	public List<Book> findAll() {
		return List.of(new Book(1l, "Book A", "Author A", 100l), new Book(2l, "Book B", "Author B", 100l),
				new Book(3l, "Book C", "Author C", 100l), new Book(4l, "Book D", "Author D", 100l),
				new Book(5l, "Book E", "Author E", 100l));
	}
}
