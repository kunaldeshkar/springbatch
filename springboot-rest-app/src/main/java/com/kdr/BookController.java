package com.kdr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		
		List<Book> list = new ArrayList<Book>();
		
		
		Book b = new Book(1, "adshj", "addaa");
		Book b1 = new Book(2, "ddssd", "sgsgseeg");
		
		list.add(b);
		list.add(b1);
		
		return list;
	}
}
