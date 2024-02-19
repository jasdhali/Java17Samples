package com.practice.collections;

import java.util.HashSet;
import java.util.Set;

import com.practice.model.Employee;

public class SetWithMemberMutating {

	public static void main(String[] args) {
		SetWithMemberMutating mutating = new SetWithMemberMutating();
		for (Employee e : mutating.getData()) {
			e.setAge(e.getAge() + 1);
		}
		mutating.getData().forEach(System.out::println);
	}

	public Set<Employee> getData() {
		Employee e1 = Employee.builder().id(1).name("Ramesh").age(10).build();
		Employee e2 = Employee.builder().id(2).name("Ram").age(11).build();
		Set<Employee> data = new HashSet<>();
		data.add(e1);
		data.add(e2);
		return data;
	}

}


