package com.practice.exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CountFrequency {
	static int[] intArr = new int[] { 1, 2, 4, 5, 3, 2, 2, 2, 2 };

	public static void main(String[] args) {
		CountFrequency countFrequency = new CountFrequency();
		List<int[]> list = countFrequency.getUniqueWithCount(intArr, countFrequency.getUnique(intArr));
		
		list.forEach( ele -> System.out.println( ele[0] + "-" + ele[1]) );
		
		System.out.println(list);
	}

	public Set<Integer> getUnique(int[] intArr) {
		Set<Integer> singleOccur = new HashSet<>();
		for (int i = 0; i < intArr.length; i++) {
			singleOccur.add(intArr[i]);
		}
		return singleOccur;
	}

	public List<int[]> getUniqueWithCount(int[] intArr, Set<Integer> uniqueInt) {
		Iterator<Integer> iterator = uniqueInt.iterator();
		List<int[]> output = new ArrayList<>();
		while (iterator.hasNext()) {
			Integer intNext = iterator.next();
			int occurrenceCount = 0;
			for (int i : intArr) {
				if (intNext == i) {
					occurrenceCount++;
				}
			}
			output.add(new int[] { intNext, occurrenceCount });
		}
		return output;
	}

}
