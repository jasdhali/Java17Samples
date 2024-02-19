package com.practice.threads;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class DataDisplayThread implements Runnable {
	private String name;
	private int startIdx;
	private int endIdx;
	private List<String> dataList;
	
	@Override
	public void run() {
		for(int i=startIdx;i<endIdx;i++) {
			System.out.println( this.name + "-"+dataList.get(i) );
		}
	}
}
