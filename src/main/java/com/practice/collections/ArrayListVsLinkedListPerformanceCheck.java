package com.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.practice.model.Employee;

public class ArrayListVsLinkedListPerformanceCheck {

	public static void main(String[] args) {
		ArrayListVsLinkedListPerformanceCheck
		check = new ArrayListVsLinkedListPerformanceCheck();
		List<Employee> list = new ArrayList<>();
		list.addAll(DataUtil.getData(100));
		
		List<Employee> linkedlist = new LinkedList();
		linkedlist.addAll(DataUtil.getData(100));
		
		check.manipulateList(list);
		System.out.println( list.size() );
	}
	public void manipulateList(List<Employee> list) {
		Iterator<Employee> iterator = list.iterator();
		while(iterator.hasNext()) {
			Employee emp = iterator.next();
			if(emp.getId()%5==0) {
				iterator.remove();
			}
		}
	}
}

