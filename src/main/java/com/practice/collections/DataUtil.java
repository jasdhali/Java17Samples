package com.practice.collections;

import java.util.Set;
import java.util.TreeSet;

import com.practice.model.Employee;

public class DataUtil {
	public static Set<Employee> getData() {
		Set<Employee> data = new TreeSet<>();
		for (int i = 0; i < 20; i++) {
			Employee e = Employee.builder().id(i + 3).name("Employee No" + i).age(11 + i * 2).build();
			data.add(e);
		}
		Employee e1 = Employee.builder().id(1).name("Ramesh").age(10).build();

		data.add(e1);

		return data;
	}

	public static Set<Employee> getData(int dataSize) {
		Set<Employee> data = new TreeSet<>();
		for (int i = 0; i < dataSize; i++) {
			Employee e = Employee.builder().id(i).sal( (i%10)*5 )  .name("Employee No" + i).age(11 + i * 2).build();
			data.add(e);
		}
		return data;
	}

}