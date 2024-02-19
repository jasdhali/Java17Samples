package com.practice.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumbers {
	List<Integer> divisor = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);

	public static void main(String[] args) {
		PrimeNumbers numbers = new PrimeNumbers();
		//System.out.println(numbers.isPrime(8));
		numbers.primeChk(3);
		numbers.primeChk(4);
		numbers.primeChk(6);
		numbers.primeChk(11);
		numbers.primeChk(12);
		numbers.primeChk(37);
		numbers.primeChk(17);
		numbers.primeChk(1);
		
	}

	public boolean isPrime(int numtoCheck) {
		boolean isPrime = true;
		for (int i = 1; i <= divisor.size(); i++) {
			if (numtoCheck % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

	public void primeChk(int checkThis) {
		List<Integer> divisorFiltered = divisor.stream().filter(element -> element != checkThis)
				.collect(Collectors.toList());
		boolean isDivisible = false;
		for (Integer intNum : divisorFiltered) {
			isDivisible = checkThis % intNum == 0;
			if(isDivisible) {
				break;
			}
		}
		System.out.println(!(isDivisible && (checkThis > 1)));
	}
}
//>1
//
