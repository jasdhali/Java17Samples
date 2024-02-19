package com.practice.collections;

import java.util.Iterator;
import java.util.Set;

import com.practice.model.Employee;

public class IteratorExample {

	public static void main(String[] args) {
		Set<Employee> set = DataUtil.getData();
		
		Iterator<Employee> dataIterator =  set.iterator();
		//dataIterator.forEachRemaining( );
		while (dataIterator.hasNext()) {
			Employee type = dataIterator.next();
			if( type.getId() % 5 == 0 ) {
				dataIterator.remove();
			}
		}
		
		set.forEach(System.out::println);
	}

}

