package com.practice.java17;

import java.util.ArrayList;
import java.util.List;

// Main class
public class TodoServiceImpl implements TodoService {
 
    // Creating a reference of
    // TodoService interface
    private TodoService todoService;
 
    // Constructor
    public TodoServiceImpl(TodoService todoService)
    {
 
        // This keyword refers to same instance itself
        this.todoService = todoService;
    }
 
    // Method
    // Filtering the string
    @Override
	public List<String>
    retrieveTodosRelatedToJava(String user)
    {
 
        List<String> filteredTodos
            = new ArrayList<String>();
        List<String> todos
            = todoService.retrieveTodos(user);
 
        for (String todo : todos) {
 
            // Filtering the string that contains "Java"
            // keyword
            if (todo.contains("Java")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

	@Override
	public List<String> retrieveTodos(String user) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("xyz");
		return list;
	}
}