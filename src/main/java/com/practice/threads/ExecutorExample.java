package com.practice.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
	}

}
