package com.practice.threads;

import java.util.ArrayList;
import java.util.List;

import com.practice.collections.DataUtil;
import com.practice.model.Employee;

public class MultipleThreadsAccessingCollection {
	public static List<Employee> listOfEmployees = new ArrayList<>();
	static {
		listOfEmployees.addAll(DataUtil.getData(5));

	}

	public static void main(String[] args) {
		// Data before update
		float totalSalPre = computeTotalSal();
		System.out.println("Before promotion - " + totalSalPre );
		processDataSingleThread();
		float totalSalPost = computeTotalSal();
		System.out.println("Post promotion - " + totalSalPost );

	}

	private static float computeTotalSal() {
		float totalSal = 0.0f;
		for (Employee emp : listOfEmployees) {
			totalSal = totalSal + emp.getSal();
		}
		return totalSal;
	}

	public static void processDataSingleThread() {
		List<Employee> promotedEmployee = new ArrayList<>();
		for (Employee employee : listOfEmployees) {
			employee.incrementSal();
		}
	}
}
