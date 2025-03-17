package com.akshay.converter;

import com.akshay.binding.Book;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class JavaToJson {
	
	public static void main(String[] args) throws Exception {
		
		Book book = new Book("Shoe Dogg", "499", "AutoBiography");
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("book.json"), book);
		System.out.println("conversion completed...");
	}

}
