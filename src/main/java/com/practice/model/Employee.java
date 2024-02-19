package com.practice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@ToString
@EqualsAndHashCode
public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int age;
	private float sal;

	@Override
	public int compareTo(Employee o) {
		return this.getId() - ((Employee) o).getId();
	}
	
	public void incrementSal() {
		this.setSal( this.getSal() + 200 );
	}

}