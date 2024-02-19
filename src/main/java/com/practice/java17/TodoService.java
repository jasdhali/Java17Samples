package com.practice.java17;

import java.util.List;

public interface TodoService {

	// Method
	// Filtering the string
	List<String> retrieveTodosRelatedToJava(String user);
	
	List<String> retrieveTodos(String user);

}