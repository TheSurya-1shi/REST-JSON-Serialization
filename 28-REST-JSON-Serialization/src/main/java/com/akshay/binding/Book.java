package com.akshay.binding;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonPropertyOrder(value="alphabetic")

public class Book {
	@JsonProperty(value="NameOfBook")
	private String bookName;
	//@JsonIgnore
	private String price;
	private String category;
	

}
