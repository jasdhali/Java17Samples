package com.practice.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ThreadExample {
	public static void main(String[] args) {
		
		ArbitraryRunnable arbitraryRunnable1 = new ArbitraryRunnable(new ArrayList<>(Arrays.asList(1,2,3) ));
		ArbitraryRunnable arbitraryRunnable2 = new ArbitraryRunnable(new ArrayList<>(Arrays.asList(4,5,6) ));
		for(int i=0;i<10;i++) {
			arbitraryRunnable1.run();
			arbitraryRunnable2.run();
		}
	}
	
}

@AllArgsConstructor
@NoArgsConstructor
@Data
class ArbitraryRunnable implements Runnable{
	private List<Integer> integers;
	@Override
	public void run() {	
		readList(this.getIntegers());
	}	
	public void readList(List<Integer> integers) {
		integers.forEach(System.out::println);
	}
}
