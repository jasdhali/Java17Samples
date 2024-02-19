package com.practice.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DataDisplayDemo {

	public static void main(String[] args) {
		List<String> data = new ArrayList<>();
		data.add("A");
		data.add("B");
		data.add("C");
		data.add("D");
		data.add("E");

		Runnable thread1 = new DataDisplayThread("Th1", 2, 4, data);
		Runnable thread2 = new DataDisplayThread("Th2", 1, 4, data);
		Runnable thread3 = new DataDisplayThread("Th3", 3, 4, data);

		ExecutorService pool = Executors.newFixedThreadPool(3);
		pool.execute(thread1);
		pool.execute(thread2);
		pool.execute(thread3);
	}
}
